package Java.DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/phone-book/problem
public class JavaMap {

    public static void main(String []argh)
    {
        Map<String, Integer> phoneNumbers = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phoneNumbers.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(phoneNumbers.containsKey(s))
                System.out.println(s + "=" + phoneNumbers.get(s).toString());
            else
                System.out.println("Not found");
        }
    }

}
