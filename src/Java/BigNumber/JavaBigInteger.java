package Java.BigNumber;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-biginteger/problem
public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        java.math.BigInteger firstNumber = scanner.nextBigInteger();
        java.math.BigInteger secondNumber = scanner.nextBigInteger();

        System.out.println(firstNumber.add(secondNumber));
        System.out.println(firstNumber.multiply(secondNumber));
    }
}
