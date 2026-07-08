
import java.util.concurrent.atomic.AtomicInteger;

class Atomic{
    static AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        Runnable task =() -> {
            for(int i = 0; i < 100000; i++){
                count.incrementAndGet();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final Count = " + count.get());
    }
}