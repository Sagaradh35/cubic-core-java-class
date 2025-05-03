package day13.oops;

public class SuperSubTest {
    public static void main(String[] args) {

        //Implicit object Casting (Conversion)
        //by Java Compiler.
        SuperDemo parent = new SubDemo();
        parent.greet();

        SubDemo obj = new SubDemo();
        obj.sayHello();

        SuperDemo parent2 = new SuperDemo();
        //explicit object Casting
        //by java programmer
        //---SubDemo child =  (SubDemo) parent2;

    }
}
