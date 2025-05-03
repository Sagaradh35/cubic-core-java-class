package day11.oops;

//Constructor Overloading: for constructor overloading either type/no/order of parameters must be different
public class Student {
    String name;
    int roll;
    public Student(){
        System.out.println(" Default constructor");
    }
    public Student(String n){
        name = n;
        System.out.println("1.Parameterized Constructor");
    }
    public Student(int r){
        roll = r;
        System.out.println("2.Parameterized Constructor");
    }
    public Student(String n , int r){
        name = n;
         roll  = r;
        System.out.println(" 3.Parameterized Constructor");
    }
    public Student(int r, String n){
        roll = r;
        name = n;
        System.out.println(" 4. Parameterized Constructor");
    }
    public void displayStudentInfo(){
        System.out.println("Student Name is:"+name);
        System.out.println("Student Roll no is :"+roll);
    }

    public static void main(String[] args) {
        Student student1 = new Student("hari", 21);
        student1.displayStudentInfo();

        System.out.println("==================");
        Student student2 = new Student();
        student2.displayStudentInfo();

        System.out.println("==================");
        Student student3 = new Student(24);
        student3.displayStudentInfo();

        System.out.println("==================");
        Student student4 = new Student(23,"Sunita");
        student4.displayStudentInfo();

    }
}
