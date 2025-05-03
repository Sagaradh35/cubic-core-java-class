package day15.accessmodifier;

public class AccessModifierDemoChild extends AccessModifierDemo{
    public static void main(String[] args) {
        //AccessModifierDemo obj = new AccessModifierDemo("hi"); due to private not accessible
        AccessModifierDemo obj = new AccessModifierDemo();
        // obj.privateMethod(); not accessible in child class due to private
        obj.protectedMethod();
        obj.defaultMethod();
        obj.publicMethod();
    }
}
