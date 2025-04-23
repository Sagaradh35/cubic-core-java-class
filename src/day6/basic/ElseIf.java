package day6.basic;

public class ElseIf {
    public static void main(String[] args) {
        int marks = 45;
        if ( marks >= 80 && marks <= 100){
            System.out.println(" A+ Grade.");
        } else if ( marks >= 60 && marks <= 79) {
            System.out.println(" A Grade. ");
        } else if ( marks >=40 && marks <= 59 ) {
            System.out.println(" B Grade.");
        }
        else{
            System.out.println(" Failed");
        }
        System.out.println(" End of the code. ");
    }
}
