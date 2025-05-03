package day14.oops;

public class AdditionalDemo {
    public void sum( int a, int b ){
        int add = a+b;
        System.out.println("1. Sum of a and b :"+add);
    }
    public void sum( double a, double b){
        double add = a+b;
        System.out.println("2.Sum of a and b :+add");
    }
    public void sum( int a, int b, int c ){
        int add = a+b+c;
        System.out.println("1. Sum of a, b,c : +add");
    }

    public static void main(String[] args) {
        AdditionalDemo obj= new AdditionalDemo();
        obj.sum(5,6);
        obj.sum(7,8,9);
        obj.sum(7.9,9.8);

    }
}
