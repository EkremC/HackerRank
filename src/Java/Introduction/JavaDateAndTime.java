package Java.Introduction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-date-and-time/problem
public class JavaDateAndTime {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        String dateString = month + "-" + day + "-" + year;
        Date date = new SimpleDateFormat("M-d-yyyy").parse(dateString);

        String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
        System.out.println(dayOfWeek.toUpperCase());
    }
}
