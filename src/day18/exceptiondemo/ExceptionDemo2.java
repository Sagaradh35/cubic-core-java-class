package day18.exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        try {
            System.out.println(" Inside try Start");
            double div = divide(a, b);
            System.out.println("Division is :" + div);
            System.out.println("Inside try close");
        } catch (ArithmeticException ae) {
            System.out.println("Catch start ");
        }
        System.out.println("End of the code");
        input.close();
    }

    public static  double divide(double a, double b){
        return a/b;
    }
}
