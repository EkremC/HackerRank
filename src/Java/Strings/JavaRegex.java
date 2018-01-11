package Java.Strings;

// https://www.hackerrank.com/challenges/java-regex/problem
public class JavaRegex {

    class MyRegex {
        String onePart = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String pattern = onePart + "." + onePart + "." + onePart + "." + onePart;
    }
}
