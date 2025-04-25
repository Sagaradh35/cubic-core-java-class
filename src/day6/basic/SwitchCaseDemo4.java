package day6.basic;

import java.util.Scanner;

public class SwitchCaseDemo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the choice.");
        String choice = input.next();

        switch (choice){ // Begin of the switch
            case "add":
                System.out.println(" This is Addition");
                break;
            case "sub" :
                System.out.println(" This is Subtraction");
                break;
            case "mul":
                System.out.println(" This is Multiplication");
                break;
            default:
                System.out.println(" Invalid choice !!!");
                break;
        } //End of the switch
        System.out.println(" End of the code ");
        input.close();

    }


}
