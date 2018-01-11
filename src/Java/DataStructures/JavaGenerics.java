package Java.DataStructures;

// https://www.hackerrank.com/challenges/java-generics/problem
public class JavaGenerics {

    class Printer
    {
        public <E> void printArray(E[] array){
            for(E element : array){
                System.out.printf("%s\n", element);
            }
        }

    }

}
