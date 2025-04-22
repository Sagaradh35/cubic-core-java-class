package day3.basic;

import java.util.Scanner;

public class ConsoleInputDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int i= input.nextInt();
        System.out.println("Enter Bytes: ");
        byte b = input.nextByte();
        System.out.println("Enter short:");
        short s = input.nextShort();
        System.out.println("Enter Long:");
        long l = input.nextLong();
        System.out.println("Enter float:");
        float f = input.nextFloat();
        System.out.println("Enter double");
        double d = input.nextDouble();
        System.out.println("Enter boolean");
        boolean b1 = input.nextBoolean();
        System.out.println("Enter a one word string:");
        String s1= input.next();
        System.out.println("Enter string as line: ");
        String s2= input.nextLine();
        System.out.println("Enter a character:");
        char c = input.next().charAt(0);

    }
}
