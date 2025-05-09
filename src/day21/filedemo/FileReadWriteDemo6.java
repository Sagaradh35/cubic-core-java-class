package day21.filedemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo6 {
    public static void main(String[] args) {
        String fileReadPath = "/Users/samidakarki/Testingfile .txt";
        String fileWritePath = "/Users/samidakarki/filedemo/Testingfile_copy_again_again.txt";
        try(
               FileReader  fis = new FileReader(fileReadPath);
               FileWriter fos = new FileWriter(fileWritePath);
                ) {
            int len;
            while((len = fis.read()) != -1) {
                System.out.println(len);
                fos.write(len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
