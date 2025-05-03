package day11.oops;

public class User {
    String name;
    int age;
//    public User(String n, int a){
//        name = n;
//        age = a;
//    }
    public User(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void display(){
        System.out.println(" User Name is :"+name);
        System.out.println(" User Age is : "+age);
    }

    public static void main(String[] args) {
        User user1 = new User(" Sagar" , 56);
        user1.display();


    }
}
