package day20.collectiondemo;
//IF we want to store a data in key value pair we have map.

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> studentMap  = new HashMap<>();
        studentMap.put(100,"Ramesh");
        studentMap.put(150,"suresh");
        studentMap.put(200,"Ganesh");
        studentMap.put(300,"Durgesh");
        System.out.println(studentMap);
        System.out.println(studentMap.get(150));
        System.out.println(studentMap.containsKey(200));
        System.out.println(studentMap.containsKey(350));
        System.out.println(studentMap.containsValue("Ramesh"));
        System.out.println(studentMap.containsValue("Hari"));
        System.out.println(studentMap.size());
       // studentMap.clear();
        System.out.println(studentMap.isEmpty());
        System.out.println(studentMap.remove(300));
        System.out.println(studentMap);


    }
}
