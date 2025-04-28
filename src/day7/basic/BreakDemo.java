package day7.basic;

public class BreakDemo {
    public static void main(String[] args) {
           for(int i = 1; i<=5 ; i++){
               if(i==3){
                   break;
               }
              System.out.println(" i is: "+i);

           }
            System.out.println(" outside from loop");
        }
    }
