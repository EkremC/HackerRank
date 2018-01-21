package Algorithms.Sorting;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/insertionsort1/problem
public class InsertionSortPart1 {

    static void insertionSort1(int n, int[] arr) {
        int unsorted = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if(unsorted < arr[i]){
                arr[i + 1] = arr[i];
                writeArray(arr);
            }else{
                arr[i + 1] = unsorted;
                writeArray(arr);
                return;
            }
        }
        arr[0] = unsorted;
        writeArray(arr);
    }

    private static void writeArray(int[] arr){
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }

}
