package day17.stringdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s1 = "Hello, I am samida Karki, I am from Nepal , I am java Developer, also I teach part time.";
        StringTokenizer st = new StringTokenizer(s1); // by default space to split
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        System.out.println("==================");
        st = new StringTokenizer(s1,",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
