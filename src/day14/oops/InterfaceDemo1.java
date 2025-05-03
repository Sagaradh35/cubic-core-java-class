package day14.oops;

public interface InterfaceDemo1 {

    // In interface, we cannot deceleration method by below.
   // public void m1(){
   // }

    // in interface class deceleration of method are:
    void m1();

    public void m2();

    abstract void m3();

    public abstract void m4(); // by default

 // Deceleration of variables;
    int a = 8;
    public int a1 = 8;
    static int a2= 8;
    final int a3 = 8;
    public final int a4 = 8;
    public static int a5 = 8;
    final static int a6 = 8;
    public static final int a7 = 8 ; // by default

    /*
 Any type of construction is not allowed
    public InterfaceDemo1(){

    }
*/
}
