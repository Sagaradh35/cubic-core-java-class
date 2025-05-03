package day15.accessmodifier;

public class OtherDemo {
    public static void main(String[] args) {
        AccessModifierDemo obj = new AccessModifierDemo();
       // obj.privateMethod();not accessible in other class due to private
        obj.protectedMethod();
        obj.defaultMethod();
        obj.publicMethod();
    }
}
