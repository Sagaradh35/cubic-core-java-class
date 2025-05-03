package day16.arraydemo;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int [][] arr = {{1,4,5},{3,6,7},{8,9,2}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }

}
