package Java.Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-currency-formatter/problem
public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale usLocale = new Locale("en", "US");
        NumberFormat nf = NumberFormat.getCurrencyInstance(usLocale);
        String us = nf.format(payment);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);

        Locale chinaLocale = new Locale("zh", "CH");
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        Locale franceLocale = new Locale("fr", "FR");
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);
        String france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
