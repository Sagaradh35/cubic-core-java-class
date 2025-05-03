package day17.stringdemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Good");
        System.out.println(sb);
        sb.append(" Morning");
        System.out.println(sb);
        sb.insert(0,"Hello, ");
        System.out.println(sb);
        sb.delete(0,7);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
