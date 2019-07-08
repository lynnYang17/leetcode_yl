
public class LearnThread{
    public static void main(String[] args) {
        ThreadOne T1 = new ThreadOne("Thread-1");
        T1.start();

        ThreadTwo T2 = new ThreadTwo("Thread-2");
        T2.start();
    }
}

class ThreadOne implements Runnable {// 利用Runnable接口创建线程
    private Thread t;
    private String threadName;

    ThreadOne(String name) {
        threadName = name;
        System.out.println("Creating: " + threadName);
    }

    public void run() {
        System.out.println("Running: " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + "," + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Thread: " + threadName + "Interrupted.");
        }
        System.out.println("Thread: " + threadName + "exiting.");
    }

    public void start() {
        System.out.println("Starting: " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}

class ThreadTwo extends Thread {
    private Thread t;
    private String threadName;

    ThreadTwo(String name) {
        threadName = name;
        System.out.println("Creating: " + threadName);
    }

    public void run() {
        System.out.println("Running: " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + "," + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Thread: " + threadName + "Interrupted.");
        }
        System.out.println("Thread: " + threadName + "exiting.");
    }

    public void start() {
        System.out.println("Starting: " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}