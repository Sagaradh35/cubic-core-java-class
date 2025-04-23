package day6.basic;

import org.w3c.dom.ls.LSOutput;

public class NestedIfElseDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 4;
        if (a > b) {
            if (a > c) {
                System.out.println(" a is the largest one.");
            } else {
                System.out.println(" c is the largest one.");
            }
        } else {
            if (b > c) {
                System.out.println(" b is the largest one");
            } else {
                System.out.println(" c is the largest one ");
            }
        }
        System.out.println(" End of the code.");
    }
}



