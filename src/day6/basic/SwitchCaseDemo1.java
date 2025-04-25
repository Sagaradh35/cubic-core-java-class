package day6.basic;

import java.util.Scanner;

public class SwitchCaseDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the choice.");
        int choice = input.nextInt();
        switch (choice){ // Begin of the switch
            case 1:
                System.out.println(" Addition");
                break;
            case 2 :
                System.out.println(" Subtraction");
                break;
            case 3 :
                System.out.println("Multiplication");
                break;
            default:
                System.out.println(" Invalid choice !!!");
                break;
        } //End of the switch
        System.out.println(" End of the code ");
        input.close();

    }
}
