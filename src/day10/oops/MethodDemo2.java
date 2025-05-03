package day10.oops;

public class MethodDemo2 {
    // <access modifier > return type method name(){
    // here you can have your own logic
    // return value matching with above type
    //}
    public int sum() {
        int a = 5;
        int b = 6;
        int sum = a + b;
        return sum;
    }
     /* << access modifier >> void < Method Name >(one or any numbers of parameters of any type ){
    here you can have your own logic.
    return value matching  with above type
    } */
     public String displayInfo(String name , int age , double salary, boolean  isActive){
         String info = "Name is :"+ name + "\nAge is :" + age +"\n Salary is :"+salary+ "\n Active?" +isActive ;
         return info;

     }

    public static void main(String[] args) {
        MethodDemo2 obj = new MethodDemo2();
        int s = obj.sum();
        System.out.println(" sum of a and b is :" + s);

        String info = obj.displayInfo( "Ram",23, 546.98,true);
        System.out.println(info);
    }
}