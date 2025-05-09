package day25.threaddemo;

public class ThreadDemo2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from thread....");
    }

    public static void main(String[] args) {
        ThreadDemo2 td1 = new ThreadDemo2();
        ThreadDemo2 td2 = new ThreadDemo2();
        ThreadDemo2 td3 = new ThreadDemo2();

        Thread t1 = new Thread(td1);
        Thread t2 = new Thread(td2);
        Thread t3 = new Thread(td3);
            t1.start();
            t2.start();
            t3.start();
    }

}
