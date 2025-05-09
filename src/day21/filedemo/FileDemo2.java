package day21.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) {
        String filepath = "/Users/samidakarki/filedemo/demofolder";
        File file = new File(filepath);
        if ( file.mkdir()){
            System.out.println(" Folder is created sucessfully");
        } else {
            System.out.println("Folder is already exist.");
        }
    }
}
