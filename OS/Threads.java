package OS; 


// Thread class implementation
class MyThread extends Thread{
    // initiated run method for thread 
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            String str = "Thread started running";
            System.out.println(str);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }
    }
}

// Runnable thread implementation 
class RunnableThread implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Runnable thread running");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Threads{
    public static void main(String[] args) {

        // class implementation
        MyThread t1 = new MyThread();
        t1.start();


        // Runnable method
        RunnableThread r = new RunnableThread();
        Thread t2 = new Thread(r);
        t2.start();

        try {
            t2.join(); // Wait for t2
            t1.join(); // Wait for t1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}