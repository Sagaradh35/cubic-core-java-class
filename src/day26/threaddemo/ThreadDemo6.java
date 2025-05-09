package day26.threaddemo;

public class ThreadDemo6 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadDemo6 t6 = new ThreadDemo6();
        ThreadDemo6 t7 = new ThreadDemo6();
        ThreadDemo6 t8 = new ThreadDemo6();
        t6.setPriority(MIN_PRIORITY);
        t6.setPriority(MIN_PRIORITY);
        t7.setPriority(NORM_PRIORITY);
        t6.start();
        t7.start();
        t8.start();


    }
}
