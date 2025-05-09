package day20.collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Integer> st= new HashSet<>();
        st.add(10);
        st.add(20);
        st.add(25);
        st.add(30);
        System.out.println(st);
        for(int a:st){
            System.out.println(a);
        }
        System.out.println("==================");
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==================");
        st.forEach(s->{
            System.out.println(s);
        });
    }
}
