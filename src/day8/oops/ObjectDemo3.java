package day8.oops;

public class ObjectDemo3 {
    public static void main(String[] args) {
        System.out.println(new ObjectDemo3().hashCode());

        ObjectDemo3 obj1;
        obj1 = new ObjectDemo3();
        System.out.println(obj1.hashCode());

        ObjectDemo3 obj2 = new ObjectDemo3();
        System.out.println(obj2.hashCode());
        System.out.println(obj2);
        System.out.println("day8.basic.ObjectDemo3@"+Integer.toHexString(obj2.hashCode()));

    }
}
