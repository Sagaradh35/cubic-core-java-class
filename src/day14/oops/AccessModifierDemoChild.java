package day14.oops;

import day15.accessmodifier.AccessModifierDemo;

public class AccessModifierDemoChild  extends AccessModifierDemo {
    public static void main(String[] args) {
          AccessModifierDemo obj = new AccessModifierDemo();
//        obj.privateMethod();  not accessible on other package ( due to private,protected, default keyword use )
//        obj.protectedMethod(); // only accessible public keyword use
//        obj.defaultMethod();
          obj.publicMethod();

        AccessModifierDemo child = new AccessModifierDemoChild();
        child.protectedMethod();
    }
}
