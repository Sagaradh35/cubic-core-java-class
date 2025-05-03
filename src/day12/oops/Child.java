package day12.oops;

public class Child extends Parent {
    //hiding Variables
    String name = " This is Child name.";


    // overriding methods
    public void greet(){
        System.out.println(" Hello from child");
        System.out.println(name);
        System.out.println(super.name);
        super.greet();

    }
}
