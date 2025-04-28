package day9.oops;

import java.util.Scanner;

public class MethodDemo1 {

    //syntax to use method
    /* << access modifier >> void < Method Name >(){
    here you can have your own logic.
    } */

    // method definition
    public void greet (){
        System.out.println(" Hello, Good Morning.");
        System.out.println(" How are you??");
    }
 /* << access modifier >> void < Method Name >(one or any numbers of parameters of any type ){
    here you can have your own logic.
    } */
public void displayInfo(String name , int age , double salary, boolean  isActive){
    System.out.println("Name is :"+name);
    System.out.println("Age is :"+age);
    System.out.println("Salary is :"+salary);
    System.out.println("Active? :"+isActive);
}


    public static void main(String[] args) {
        MethodDemo1 obj = new MethodDemo1();
        // method calling
        obj.greet();

        //method calling
        obj.displayInfo("Ram",32, 87950, true);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name :");
        String name = input.next();
        System.out.print("Enter Age: ");
        int age = input.nextInt();
        System.out.print(" Enter Salary:");
        double salary = input.nextDouble();
        System.out.print(" Is Active :");
        boolean isActive = input.nextBoolean();
        // method calling
        obj.displayInfo(name,age,salary,isActive);


    }
}
