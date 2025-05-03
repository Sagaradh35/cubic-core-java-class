package day18.exceptiondemo;

public class ExceptionDemo8 {
    public static void main(String[] args) {
      vote(15);
        System.out.println("Voted...");
    }

    public static void vote(int age){

        if (age >= 18){
            System.out.println("You can Vote!!!!!");
        }else {
            //System.out.println("you cannot Vote...");

            //throw new ArithmeticException("You cannot Vote...");
            InvalidAgeException iae = new InvalidAgeException("you cannot vote...");
            throw iae;

        }


    }
}
