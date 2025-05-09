package day20.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer,String> studentMap  = new HashMap<>();
        studentMap.put(100,"Ramesh");
        studentMap.put(150,"suresh");
        studentMap.put(200,"Ganesh");
        studentMap.put(300,"Durgesh");
        System.out.println(studentMap);

        //there is a special loop (iteration) for map
        for(Map.Entry<Integer,String> students:studentMap.entrySet()){
            System.out.println(students.getKey()+" "+students.getValue());

    }
}
}
