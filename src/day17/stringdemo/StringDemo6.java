package day17.stringdemo;

// Regular expression used for validation
public class StringDemo6 {
    public static void main(String[] args) {
//        System.out.println(isTrue("true"));
//        System.out.println(isTrue("false"));
//        System.out.println(isTrue("Hello"));
//        System.out.println(isMatched("abc"));
//        System.out.println(isMatched("abc"));
        System.out.println(isValidPassword("abc123"));

    }
    public static boolean isTrue(String s){
       // return s.matches("true");
        return s.matches("[T|t]rue");
    }

    public static boolean isMatched(String s){
       // return s.matches("[abc]");
        return s.matches(" [^ abc]");

    }

    public static  boolean isValidPassword(String password){
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        return password.matches(regex);

        //return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");

    }
}
