package day26.threaddemo;

public class ThreadDemo5 extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        ThreadDemo5 t1 = new ThreadDemo5();
        ThreadDemo5 t2 = new ThreadDemo5();
        ThreadDemo5 t3 = new ThreadDemo5();
        ThreadDemo5 t4 = new ThreadDemo5();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
