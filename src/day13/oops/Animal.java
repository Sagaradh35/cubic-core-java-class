package day13.oops;

public /*final*/ abstract class Animal {

 /*   public void makeSounds(){
        System.out.println(" Animal make sounds.......");
    }*/

   // abstract  int a = 5; ( we cannot use abstract keywords at the time variable deceleration)

    // we cannot use final, static and private keywords
    public abstract void makeSounds();

    public void dance(){
        System.out.println(" Animal dance.....");
    }
}
