package day15.arrya;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int [] arr = new int[] {4,5,6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(" The sum of an array elements:" +sum);
    }
}
