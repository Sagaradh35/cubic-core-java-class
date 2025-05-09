package day20.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(21);
        al.add(2);
        al.add(31);
        al.add(4);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);

        // for sorting, we don't write long code .. Instead of this code we write above code for sorting
/*      al.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2){
                    return 1;
                } else if (o1 < o2){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(al);*/

    }
}
