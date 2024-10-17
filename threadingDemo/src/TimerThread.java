public class TimerThread implements Runnable {
    private Thread thread;
    private String threadName;

    public TimerThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Starting " + threadName);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println("Cutted : " + threadName);
        }
        System.out.println("Thread Done." + threadName);
    }

    public void start() {
        System.out.println("Creating Thread..");
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}


