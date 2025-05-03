package day17.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "Good Morning";
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0,4));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf("M"));
        System.out.println(s1.concat(" Sagar"));
        System.out.println("Hello,".concat(s1));
        System.out.println(s1.lastIndexOf("o"));
        System.out.println(s1.contains("Good"));
        System.out.println(s1.contains("Bad"));

        char []  ch = s1.toCharArray();
        System.out.println(ch[5]);

        System.out.println(s1.replaceAll("Morning","Evening"));
        System.out.println(s1.replaceFirst("G","B"));
        String s2 = " Hello, I am Mount Everest.";
        System.out.println(s2);
        System.out.println(s2.trim());
        System.out.println(s1.startsWith("G"));
        System.out.println(s1.startsWith("H"));

    }
}
