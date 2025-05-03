package day11.oops;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        //set
        employee1.setEmpName("Hari");
        employee1.setEmpId(2);
        //get
        System.out.println(employee1.getEmpName());
        System.out.println(employee1.getEmpId());
    }
}
