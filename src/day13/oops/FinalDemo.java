package day13.oops;


//Final Keyword
// we cannot extends(inheritance ) final class.

public /*final*/ class FinalDemo {

    //if we use final keyword on variable
    //that variable will become constant
    //this should initialization at the time of declaration
    // from constructor

    // final int a = 6;
    final int a;

    //We cannot use a final keyword on constructor
 public /*final*/ FinalDemo(int a){
 this.a = a;
 }

    //final keyword cannot be overridden
    public /*final*/ void sayHello(){
        System.out.println(" Hello from Parent ");

    }
}
