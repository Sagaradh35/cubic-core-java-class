package day25.threaddemo;

public class ThreadDemo4 extends Thread{


    public void run(){
      try{
          for (int i = 1; i <=5 ; i++) {

              System.out.println("i is :"+i);
             Thread.sleep(3000);
          }
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
    }

    public static void main(String[] args) {
        ThreadDemo4 td1 = new ThreadDemo4();
        ThreadDemo4 td2 = new ThreadDemo4();
        ThreadDemo4 td3 = new ThreadDemo4();
        ThreadDemo4 td4 = new ThreadDemo4();
        td1.start();
        td2.start();
        td3.start();
        td4.start();

    }

}
