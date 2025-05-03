package day12.oops;

public class ParentChildTest {
    public static void main(String[] args) {
        Parent parnt = new Parent();
        System.out.println(parnt.name);
        parnt.greet();

        System.out.println("==================");
        Child chd = new Child();
        System.out.println(chd.name);
        chd.greet();

    }
}
