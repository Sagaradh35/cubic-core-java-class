package day4.basic;

public class TypeCastingDemo {
    public static void main(String[] args) {
        // implicit type conversion ( Casting)
        // by java compiler
        byte b1 = 127;
        int i1 = b1;
        System.out.println( b1 );
        System.out.println( i1 );

       // Explicit type conversion (Casting)
        // by java programmer
        int i2 = 127;
        byte b2 = (byte) i2;
        System.out.println(i2);
        System.out.println(b2);

        int i3 = 200;
        byte b3 = (byte) i3;
        System.out.println(i3);
        System.out.println(b3);






    }
}
