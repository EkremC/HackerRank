package Java.Strings;

import java.util.ArrayList;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-string-compare/problem
public class JavaSubstringComparisons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int size = scan.nextInt();
        ArrayList<String> wordsList = new ArrayList<>();
        String minWord;
        String maxWord;

        for (int i = 0; i < (word.length() - (size - 1)); i++) {
            String subWord = word.substring(i, (size + i));
            wordsList.add(subWord);
        }

        minWord = wordsList.get(0);
        maxWord = wordsList.get(0);
        for (int i = 1; i < wordsList.size(); i++) {
            if (wordsList.get(i).compareTo(minWord) < 0)
                minWord = wordsList.get(i);
            if (wordsList.get(i).compareTo(maxWord) > 0)
                maxWord = wordsList.get(i);
        }

        System.out.println(minWord);
        System.out.println(maxWord);
    }
}
