package day21.filedemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
    public static void main(String[] args) {
        String filepath = "/Users/samidakarki/filedemo/demo1.txt";
        File file = new File(filepath);
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
      //  file.setWritable(false);// if this method executes we cannot write over the original file. { Lock the file)
        file.setWritable(true); // this is for to write on the created file.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd  HH:mm:ss a");
        System.out.println(sdf.format(new Date(file.lastModified())));
        System.out.println(file.getTotalSpace());
        System.out.println(file.getUsableSpace());
        System.out.println(file.isDirectory());


        String filepath2 = "/Users/samidakarki/filedemo/demo2.txt";
        File file2 = new File(filepath2);
        try {
            if (file2.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("===============");

        String filepath3 = "/Users/samidakarki/filedemo/demofolder/demo3.txt";
        File file3 = new File(filepath3);
        try {
            if (file3.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("===============");
//        System.out.println(file2.renameTo(file3));
    }
}
