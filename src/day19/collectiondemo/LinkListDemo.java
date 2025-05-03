package day19.collectiondemo;


import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {
    public static void main(String[] args) {
        List<Integer> al = new LinkedList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
        al.add(22);
        System.out.println(al);
        al.add(2,55);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        al.set(2,33);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(2));
        System.out.println(al.contains(33));
        System.out.println(al.contains(46));
        // al.clear();
        System.out.println(al);
        System.out.println(al.isEmpty());
        al.addFirst(88);
        System.out.println(al);
        al.addLast(36);
        System.out.println(al);

        List<Integer> al2 = new LinkedList<>();
        al2.add(29);
        System.out.println(al2);
        //al2.addAll(al);
        // System.out.println(al2);
        al2.addAll(0,al);
        System.out.println(al2);
        // al2.removeAll(al);
        System.out.println(al2);
        al2.retainAll(al);
        System.out.println(al2);


    }
}
