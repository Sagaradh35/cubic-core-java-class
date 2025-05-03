package day17.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
// Implicit Creation
        String s1 = "Hello";
        System.out.println(s1);

        // Explicit creation
        String s2 = new String();
        System.out.println(s2);

        String s3 = new String("hello");
        System.out.println(s3);

        char[] chr = {'a', 'b','c'};
        String s4 = new String(chr);
        System.out.println(s4);

        byte [] by = {45,66,77};
        String s5 = new String(by);
        System.out.println(s5);
    }
}
