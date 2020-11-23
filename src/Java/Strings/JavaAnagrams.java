package Java.Strings;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/java-anagrams/problem
public class JavaAnagrams {

    private static boolean isAnagram(String a, String b) {
        a = sort(a);
        b = sort(b);
        if(a.equalsIgnoreCase(b)){
            return true;
        }else {
            return false;
        }
    }

    private static String sort(String a) {
        char arr[] = a.toLowerCase().toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);

        return sorted;

    }
}
