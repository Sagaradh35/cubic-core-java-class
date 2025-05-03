package day10.oops;

public class User {

  /*  Constructor : is a special member's function which has following Characteristic.
  1. Its name is same as a class
  2. It has no return type
  3. we cannot use even void keyword
  4. it is mainly used to initializer member data.
  5.it runs only one time for each object.
  6.it can have any access modifier.
   */
  String name;
  int age;
  //create a constructor
    public User(String n , int a){
        name = n;
        age = a;
        System.out.println(" This is the constructor");
    }
    public void displayInfo(){
        System.out.println(" Name is : "+name);
        System.out.println(" Age is : "+age);
    }

    public static void main(String[] args) {
        User user1 = new User("Ramesh",34);
        user1.displayInfo();

        System.out.println("=================");
        User user2 = new User("Hari",45);
        user2.displayInfo();

        System.out.println("==================");
        User user3 = new User("Shyam", 45);
        user3.displayInfo();

    }

}
