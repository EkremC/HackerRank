package Java.Advanced;

// https://www.hackerrank.com/challenges/java-singleton/problem
public class JavaSingletonPattern {

    public String str;
    private static JavaSingletonPattern singletonInstance;
    private JavaSingletonPattern(){}



    public static JavaSingletonPattern getSingleInstance(){
        if(singletonInstance == null){
            synchronized(JavaSingletonPattern.class){
                if(singletonInstance ==  null){
                    singletonInstance = new JavaSingletonPattern();
                }
            }
        }
        return singletonInstance;
    }

}
