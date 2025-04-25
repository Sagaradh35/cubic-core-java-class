package day6.basic;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the choice.");
        char choice = input.next().charAt(0);
        int a = 0;
        int b = 0;
if (choice == '+' || choice == '-' || choice == '*') {
    System.out.print(" Enter a: ");
    a = input.nextInt();
    System.out.print(" Enter b :");
    b = input.nextInt();
}
        switch (choice){ // Begin of the switch
            case '+':
                int sum = a+b;
                System.out.println(" sum of a and b is  :" +sum);
                break;
            case '-' :
                int sub = a-b;
                System.out.println(" Subtraction of a and b  is:"+sub);
                break;
            case '*' :
                int multi = a*b;
                System.out.println(" Multiplication of a and b is :" +multi);
                break;
            default:
                System.out.println(" Invalid choice !!!");
                break;
        } //End of the switch
        System.out.println(" End of the code ");
        input.close();

    }


}
