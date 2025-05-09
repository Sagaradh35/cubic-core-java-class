package day20.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {4,2,6,5};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("===================");
        // convert array into list
        Integer [] ar = {4,2,6,5};
        System.out.println(Arrays.toString(ar));
        List<Integer> li = Arrays.asList(ar);
        System.out.println(li);

        System.out.println("===================");
        //convert list to array
        List<Integer> l = Arrays.asList(4,5,8,2);
        System.out.println(l);
        Integer[] al = l.toArray(new Integer[0]);
        System.out.println(Arrays.toString(al));

    }
}
