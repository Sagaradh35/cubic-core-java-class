package day19.collectiondemo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistDemo2 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(45);
        li.add(56);
        li.add(55);
       System.out.println(li);
        System.out.println(li.get(0));
        System.out.println(li.get(1));
        System.out.println(li.get(2));

        System.out.println("=============");
        for (int i = 0; i < li.size() ; i++) {
            System.out.println(li.get(i));
        }

        System.out.println("====================");
        for(int a:li){
            System.out.println(a);
        }

        System.out.println("=====================");
        Iterator<Integer> it = li.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("====================");
        ListIterator<Integer> lit = li.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println();
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }

        System.out.println("======After Java 8 we write ======");
        li.forEach(a->{
            System.out.println(a);
        });
    }
}
