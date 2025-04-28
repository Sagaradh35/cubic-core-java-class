package day9.oops;

public class StaticNonStaticDemo {

    // non static (instance) Variable, member's Data, Data, attributes, properties ( also called as)
    String nonStaticVar = " This is non-static Variable";

    // Class level's data
    static String staticVar = "This is static variable";

    //member's behaviour/ method
    public void nonStaticMethod(){
        System.out.println(" Hello, This is non-static Method");
    }

    //class level method
    public static void staticMethod(){
        System.out.println(" Hello, This is static Method");
    }

    public static void main(String[] args) {

        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        System.out.println(obj.nonStaticVar);
        obj.nonStaticMethod();

        System.out.println(staticVar);
        staticMethod();

        // best approach  to use static
        System.out.println(StaticNonStaticDemo.staticVar);
        StaticNonStaticDemo.staticMethod();


    }
}
