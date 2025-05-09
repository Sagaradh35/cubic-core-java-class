package day21.filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWriteDemo4 {
    public static void main(String[] args) {
        String fileReadPath = "/Users/samidakarki/Testingfile .txt";
        String fileWritePath = "/Users/samidakarki/filedemo/Testingfile_copy .txt";
        FileInputStream fis = null;
        FileOutputStream fos = null;
            try {
                fis = new FileInputStream(fileReadPath);
                fos = new FileOutputStream(fileWritePath);
                int len;
                while((len = fis.read()) != -1) {
                    System.out.println(len);
                    fos.write(len);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    fis.close();
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

    }
}
