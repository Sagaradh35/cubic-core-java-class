package day15.arrya;

// Array: is a group/ collection of elements of same type arranged in contiguous ( sequential) manner.
// Syntax : <type> []  <array name> = new  <type>  [size of array ];
// array.length = gives the size of an array.

public class ArrayDemo1 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 14;
        arr[1] = 15;
        arr[2] = 16;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

}
