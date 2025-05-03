package day11.oops;
// shadowing : is a process of hiding instance variable by local variable
//inside non-static method and constructor of a class

// this is a keyword and is an implicit reference variable of an current type and current object
// and is available inside non-static method and constructor of a class.
public class ThisDemo1 {
   // non-static ( instance ) variable
    int a = 5;
    // non-static method
    public void print(){
        System.out.println(" this is :"+this);
        System.out.println(a); //this.a
        System.out.println(this.a);
        // local variable
        int a = 6;
        System.out.println(a);
//        ThisDemo1 obj = new ThisDemo1();
//        int sum = a + obj.a;
        int sum = a + this.a;
        System.out.println("sum is "+sum);
    }
 public static void display(){
        ThisDemo1 obj = new ThisDemo1();
     System.out.println(obj.a);
        int a=5;
     System.out.println(a);
 }
    public static void main(String[] args) {
        ThisDemo1 obj1 = new ThisDemo1();
        System.out.println(" obj1 is:" +obj1);
        obj1.print();

        System.out.println("=================");
        ThisDemo1 obj2 = new ThisDemo1();
        System.out.println(" obj2 is:" +obj2);
        obj2.print();

    }
}
