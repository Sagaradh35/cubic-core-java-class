package day8.oops;

public class NonStaticDemo1 {

    // Non-Static (instance) Variable
    int a = 4;
    int b = 6 ;

    //Non-static Method
    public void Greet(){
        System.out.println(" Good Morning. ");
    }

    public static void main(String[] args) {
       // int sum = a + b; Not working with out creating object

        NonStaticDemo1 obj = new NonStaticDemo1();
        int sum = obj.a + obj.b;
        System.out.println(" sum of a and b is : " +sum);
        obj.Greet();
    }
}
