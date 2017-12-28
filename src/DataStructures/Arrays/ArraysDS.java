package DataStructures.Arrays;


// https://www.hackerrank.com/challenges/arrays-ds/problem


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysDS {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = null;
        try {
            int numberOfArray = Integer.parseInt(br.readLine());
            arr = br.readLine().split(" ");
            List<String> lists = Arrays.asList(arr);
            Collections.reverse(lists);
            String[] reversedArr = lists.toArray(arr);
            for (String s : reversedArr) {
                System.out.print(s + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
