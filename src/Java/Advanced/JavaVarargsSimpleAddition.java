package Java.Advanced;

// https://www.hackerrank.com/challenges/simple-addition-varargs/problem
public class JavaVarargsSimpleAddition {

    public void add(int... numbers){
        int sum = 0;
        String s = "";

        for(int i : numbers){
            sum += i;
            s += i + "+";
        }

        s = s.substring(0, s.length() - 1) + "=" + sum;
        System.out.println(s);
    }

}
