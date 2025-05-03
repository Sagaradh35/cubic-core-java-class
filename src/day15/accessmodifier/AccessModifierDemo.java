package day15.accessmodifier;

public class AccessModifierDemo {

    // Variable Deceleration
    String defaultVar =" This is default variable";
    public String publicVar = "This is public variable";
    private String privateVar = " This is Private Variable";
    protected String protectedVar = " This is Protected Variable";

    // Method Deceleration using access modifier
    void defaultMethod(){
        System.out.println(" This is Default Method.");
    }
    public void publicMethod(){
        System.out.println(" This is public Method.");
    }
    private void privateMethod(){
        System.out.println(" This is private Method.");
    }
    public void protectedMethod(){
        System.out.println("This is Protected Method.");
    }

// Constructor Deceleration using access modifier
    public AccessModifierDemo(){
        System.out.println("This is public constructor.");
    }

     AccessModifierDemo(int a ){
        System.out.println(" This is default access Constructor");
    }

    protected AccessModifierDemo(int a, int b ){
        System.out.println(" This is protected Constructor");
    }

    private AccessModifierDemo(String s ){
        System.out.println(" This is private Constructor");
    }

    public static void main(String[] args) {
        AccessModifierDemo obj = new AccessModifierDemo("hi");
        obj.privateMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.publicMethod();
    }
}
