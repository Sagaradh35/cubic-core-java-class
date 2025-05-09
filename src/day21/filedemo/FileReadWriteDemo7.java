package day21.filedemo;

// read line by line.

import javax.sound.sampled.Line;
import java.io.*;

public class FileReadWriteDemo7 {
    public static void main(String[] args) {
        String fileReadPath = "/Users/samidakarki/Testingfile .txt";
        String fileWritePath = "/Users/samidakarki/filedemo/Testingfile_copy_again_again3.txt";
        try(
                FileReader fis = new FileReader(fileReadPath);
                BufferedReader br = new BufferedReader(fis);
                FileWriter fos = new FileWriter(fileWritePath);
                BufferedWriter bw = new BufferedWriter(fos);
        ) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
                fos.write(line);
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
