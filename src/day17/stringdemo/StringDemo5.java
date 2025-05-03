package day17.stringdemo;

//Regular Expression
public class StringDemo5 {
    public static void main(String[] args) {
        String s1 = "Hello, I am samida Karki, I am from Nepal , I am java Developer, also I teach part time.";
        System.out.println(s1);
        String[] ss = s1.split(",");
        for (String s : ss) {
            System.out.println(s);
        }
        System.out.println("===============");
        ss = s1.split(" ");
        for (String s : ss) {
            System.out.println(s);
        }
    }

}
