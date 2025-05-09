package day26.threaddemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTest {
    public static void main(String[] args) {
        Task t1 = new Task("task1");
        Task t2 = new Task("task2");
        Task t3 = new Task("task3");
        Task t4 = new Task("task4");
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.execute(t1);
        service.execute(t2);
        service.execute(t3);
        service.execute(t4);
        service.shutdown();

    }
}
