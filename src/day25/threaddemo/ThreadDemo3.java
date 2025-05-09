package day25.threaddemo;

public class ThreadDemo3 {
    public static void main(String[] args) {
        // anonymous in class of thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" hello from thread..");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" hello from thread..");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" hello from thread..");
            }
        });
        t1.start();
        t2.start();
        t3.start();

    }
}
