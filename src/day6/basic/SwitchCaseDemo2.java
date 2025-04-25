package day6.basic;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the choice.");
        char choice = input.next().charAt(0);

        switch (choice){ // Begin of the switch
            case '+':
                System.out.println(" This is Addition");
                break;
            case '-' :
                System.out.println(" This is Subtraction");
                break;
            case '*' :
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
