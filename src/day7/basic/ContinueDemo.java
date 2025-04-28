package day7.basic;

public class ContinueDemo {
    public static void main(String[] args) {
        for(int i = 1; i<=5 ; i++){
            if(i==3){
                continue;
            }
            System.out.println(" i is: "+i);
        }
        System.out.println(" outside from loop");
    }
}

