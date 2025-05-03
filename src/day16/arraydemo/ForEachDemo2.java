package day16.arraydemo;

public class ForEachDemo2 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{3,4,5},{5,6,7}};

        for(int [] ar:arr){
            for(int a:ar){
                System.out.print(a+" ");
            }
            System.out.println();
        }

    }
}
