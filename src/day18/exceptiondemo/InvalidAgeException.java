package day18.exceptiondemo;

public class InvalidAgeException extends RuntimeException {
   public InvalidAgeException(String msg){
       super(msg);
   }

}
