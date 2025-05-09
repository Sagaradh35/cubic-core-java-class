package day20.collectiondemo;
//Map has also three implementation class same as set

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<Integer,String> hashMap  = new HashMap<>();
        hashMap.put(150,"suresh");
        hashMap.put(100,"Ramesh");
        hashMap.put(200,"Ganesh");
        hashMap.put(100,"Ganesh");
        hashMap.put(300,"Durgesh");
        System.out.println("Hash Map is:"+hashMap);

        System.out.println("============================");
        Map<Integer,String> linkedHashMap  = new LinkedHashMap<>();
        linkedHashMap.put(150,"suresh");
        linkedHashMap.put(100,"Ramesh");
        linkedHashMap.put(200,"Ganesh");
        linkedHashMap.put(100,"Ganesh");
        linkedHashMap.put(300,"Durgesh");
        System.out.println("Linked Hash Map is:"+linkedHashMap);

        System.out.println("============================");
        Map<Integer,String> treeMap  = new TreeMap<>();
        treeMap.put(150,"suresh");
        treeMap.put(100,"Ramesh");
        treeMap.put(200,"Ganesh");
        treeMap.put(100,"Ganesh");
        treeMap.put(300,"Durgesh");
        System.out.println("Tree Map is:"+treeMap);


    }
}
