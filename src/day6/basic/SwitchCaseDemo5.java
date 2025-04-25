package day6.basic;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a day of the  Week: ");
        String day = input.next().toLowerCase();

        switch (day){
            case "saturday":
            case "sunday":
                System.out.println( " Funday !!! ");
                break;
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
                System.out.println(" Working Day !!!");
                break;
            case "friday":
                System.out.println(" Party Day !!!");
                break;
            default:
                System.out.println(" Invalid Day !!!");
                break;
        }
        System.out.println(" End of code" );
        input.close();


    }
}
