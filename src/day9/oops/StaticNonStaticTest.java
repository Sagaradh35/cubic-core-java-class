package day9.oops;

public class StaticNonStaticTest {
    public static void main(String[] args) {

        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        System.out.println(obj.nonStaticVar);
        obj.nonStaticMethod();

     /*   System.out.println(staticVar);
        staticMethod();*/    // don't run this line is because only applicable in same class not other class
        // so for static to use  on other class below best approach should be written.

        // best approach  to use static
        System.out.println(StaticNonStaticDemo.staticVar);
        StaticNonStaticDemo.staticMethod();


    }
}
