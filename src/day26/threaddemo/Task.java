package day26.threaddemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task extends Thread{
    private String threadName;
 public Task(String threadName){
     this.threadName = threadName;
 }
 public String getThreadName(){
     return threadName;
    }

 public void run(){
     SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
     for (int i = 0; i <=5 ; i++) {
         if(i==0){
             System.out.println("Thread is initiated with name:"+ getThreadName() + " at:" + sdf.format(new Date()));
         }else{
             System.out.println("Thread is started with name:"+ getThreadName() + " at:" + sdf.format(new Date()));
         }
         System.out.println("completed " +getThreadName());
     }
 }
}
