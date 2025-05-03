package day16.arraydemo;

public class ForEachDemo1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int sum = 0;
        for (int a: arr) {
            sum = sum+a;
        }
        System.out.println("Sum of an array elements :"+sum);
    }
}
