package day7.basic;

import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while( flag){
            System.out.print(" Enter the name :");
            String name = input.next();
            System.out.println(" Name is : "+name);
            if(name.equals("Santosh")){
                flag = false;
            }
        }
        System.out.println(" outside from the loop ");
    }
}
