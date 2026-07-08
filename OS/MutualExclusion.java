
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MutualExclusion{
    // 1. Create the ReadWriteLock instance
    private static final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    
    // 2. Extract the Write Lock to protect the counter during modification
    private static final Lock lock = rwLock.writeLock();

    static int count = 0;
    public static void main(String[] args) throws InterruptedException{
        Runnable task = () -> {
            lock.lock();
            for(int i = 0; i < 10000; i++){
                count++;
            }
            lock.unlock(); 
        };

        Thread t1 = new Thread(task); 
        Thread t2 = new Thread(task); 
        
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(count);
    }
}