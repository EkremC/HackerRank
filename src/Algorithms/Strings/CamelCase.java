package Algorithms.Strings;

// https://www.hackerrank.com/challenges/camelcase/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CamelCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int wordNumber = (int) line.chars().filter(m -> (m >= 'A' && m <= 'Z')).count();
        // line.chars().filter(Character::isUpperCase).count();
        System.out.println(wordNumber + 1);
    }
}
