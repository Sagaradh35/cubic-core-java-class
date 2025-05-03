package day15.arrya;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int [] arr = {4,5,6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(" The sum of an array elements:" +sum);
    }
}
