package day15.arrya;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        Scanner input = new Scanner(System.in);
        // initializing an array
        for( int i = 0; i< arr.length; i++ ){
            System.out.println(" Enter elements:");
            arr[i] = input.nextInt();
        }
        //traversing an array ( Printing)
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            System.out.print(arr[i]+" ");
        }
    }
}
