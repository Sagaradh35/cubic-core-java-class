package day26.threaddemo;

public class ThreadDemo7 extends Thread{
    @Override
    public void run(){
       try{
           for (int i = 1; i <=5 ; i++) {
               System.out.println(" i is :"+i);
               Thread.sleep(9000);
           }
       } catch ( InterruptedException e) {
           throw new RuntimeException(e);
       }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo7 t1 = new ThreadDemo7();
        ThreadDemo7 t2 = new ThreadDemo7();
        ThreadDemo7 t3 = new ThreadDemo7();
        t1.start();
        t1.join(); // join method means it completely block to execute
        t2.start();
        t3.start();
    }
}
