package day20.collectiondemo;

//Implementing the class of set ( there are mainly three class to implementing the set)

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        Set<Integer> hst= new HashSet<>();
        hst.add(10);
        hst.add(20);
        hst.add(25);
        hst.add(30);
        hst.add(10);
        System.out.println("Hash set is: "+hst);
        System.out.println("====================");
        Set<Integer> lhst= new LinkedHashSet<>();
        lhst.add(10);
        lhst.add(20);
        lhst.add(25);
        lhst.add(30);
        lhst.add(10);
        System.out.println("Linked Hash set is: "+lhst);
        System.out.println("====================");
        Set<Integer> tst= new TreeSet<>();
        tst.add(10);
        tst.add(20);
        tst.add(25);
        tst.add(30);
        tst.add(10);
        System.out.println("Tree set is: "+tst);



    }
}
