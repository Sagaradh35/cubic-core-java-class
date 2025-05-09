package day20.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(21);
        al.add(2);
        al.add(31);
        al.add(4);
        System.out.println(al);
        al.add(36);
        System.out.println(al);


       //unmodifiable list we cannot add a element. sometime we have to lock our list we don't want to modify.
        List<Integer> ls = Collections.unmodifiableList(al);
        System.out.println(ls);
        System.out.println(Collections.singleton(44));
        //if we add a element we got error at runtime.
        ls.add(45);
        System.out.println(ls);

        System.out.println(Collections.singleton(44));

    }
}
