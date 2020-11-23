package Algorithms.Sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int searchedValue, sizeOfArray, index;


        searchedValue = scan.nextInt();
        sizeOfArray = scan.nextInt();
        int array[] = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++)
            array[i] = scan.nextInt();

        for (int i = 0; i < sizeOfArray; i++) {
            if (array[i] == searchedValue) {
                System.out.println(i);
            }
        }
    }


}
