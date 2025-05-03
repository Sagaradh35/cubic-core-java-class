package day18.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           int [] div = new int[2];
        try {
            System.out.println("Enter a:");
            int a = input.nextInt();
            System.out.println("Enter b:");
            int b = input.nextInt();
             div[2] = divide(a, b);
            System.out.println("Division is :" + div[2]);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (InputMismatchException ie) {
            System.out.println(ie);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static  int divide(int a, int b){
        return a/b;
    }
}


