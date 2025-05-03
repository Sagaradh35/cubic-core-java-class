package day18.exceptiondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        formatDate();
        try {
            parseDate();
        } catch (ParseException e) {
            System.out.println(e);
        }
    }
public static void parseDate() throws ParseException {
        String date = "2025-01-01";
    System.out.println(date);
    SimpleDateFormat sgf = new SimpleDateFormat("MM:dd:yyyy");
    sgf.parse(date);
}
    public static void formatDate(){
        //date
        Date currentDate = new Date();
        System.out.println(currentDate);
        SimpleDateFormat sdf = new SimpleDateFormat("MM:dd:yyyy HH:mm a");
        //String
        String formattedDate = sdf.format(currentDate);
        System.out.println(formattedDate);

    }
}
