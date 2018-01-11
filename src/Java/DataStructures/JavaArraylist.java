package Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-arraylist/submissions/code/47610674
public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<ArrayList<Integer>> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < l; j++) {
                line.add(sc.nextInt());
            }
            lines.add(line);
        }

        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int lineNumber = sc.nextInt();
            int elementNumber = sc.nextInt();

            if(lines.get(lineNumber - 1).size() >= elementNumber){
                System.out.println(lines.get(lineNumber - 1).get(elementNumber - 1));
            }else{
                System.out.println("ERROR!");
            }
        }
    }
}
