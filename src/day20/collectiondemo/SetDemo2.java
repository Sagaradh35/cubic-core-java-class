package day20.collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//Difference between Hashset and ArrayList
//1. In arraylist data is maintained an insertion order but set doesn't maintain the insertion order. (random order)
//2. list allow duplicate element but set doesn't allow duplicate element.
//3. In list, we can add data at any index but we cant at set, not only add we cant do any kind of index base operation.
public class SetDemo2 {
    public static void main(String[] args) {
        Set<Integer> st= new HashSet<>();
        st.add(10);
        st.add(20);
        st.add(25);
        st.add(30);
        st.add(10);
        System.out.println(st);
       // st.add(4,59);
        //st.set(1,22);
       // System.out.println(li.get(2));

        List<Integer> li= new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(25);
        li.add(30);
        li.add(10);
        System.out.println(li);
        li.add(4,59);
        System.out.println(li);
        li.set(1,22);
        System.out.println(li);
        System.out.println(li.get(2));
    }
}
