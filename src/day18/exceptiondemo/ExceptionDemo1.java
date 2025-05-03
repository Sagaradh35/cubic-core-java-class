package day18.exceptiondemo;

public class ExceptionDemo1 {
    public static void main(String[] args) {
         //int div = 50/0;
       // System.out.println(div);  due to ArithmeticException

      //  String s = null;
      //  System.out.println(s.length()); due to NullPointerException

        String ss = "abc";
       // System.out.println(Integer.parseInt(ss)); NumberFormatException

        int[] arr = new int[3];
       // System.out.println(arr[3]); ArrayIndexOutOfBoundsException
    }
}
