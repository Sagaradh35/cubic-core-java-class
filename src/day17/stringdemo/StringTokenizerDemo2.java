package day17.stringdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo2 {
    public static void main(String[] args) {
        String s1 = "Hello,, I am sunita Karki,, I am from Nepal ,, I am java Developer,, also I teach part time.";
        StringTokenizer st = new StringTokenizer(s1,",");
        System.out.println(st.countTokens());
        System.out.println(st.nextToken());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        System.out.println("==================");
       String[] ss = s1.split(",");
        System.out.println(ss.length);
        for (String s : ss) {
            System.out.println(s);
        }
    }
    }

