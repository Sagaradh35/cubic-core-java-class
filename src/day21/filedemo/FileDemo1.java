package day21.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) {
        String filepath = "/Users/samidakarki/filedemo/demo1.txt";
        File file = new File(filepath);
        try {
            if(file.createNewFile()){
                System.out.println("File Created Sucessfully.");
            } else {
                System.out.println(" File already exists. ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
