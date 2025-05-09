package day21.filedemo;

import java.io.*;

// Char bit

public class FileReadWriteDemo5 {
    public static void main(String[] args) {
        String fileReadPath = "/Users/samidakarki/Testingfile .txt";
        String fileWritePath = "/Users/samidakarki/filedemo/Testingfile_copy_again.txt";
        FileReader fis = null;
        FileWriter fos = null;
        try {
            fis = new FileReader(fileReadPath);
            fos = new FileWriter(fileWritePath);
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
