package day8.oops;

public class StaticDemo1 {
    // Static (instance) Variable
   static int a = 4;
    static int b = 6 ;

    //static Method
    public static void Greet(){
        System.out.println(" Good Morning. ");
    }

    public static void main(String[] args) {
        int sum = a + b;
        System.out.println(" sum of a and b is : " +sum);
        Greet();
    }
}
