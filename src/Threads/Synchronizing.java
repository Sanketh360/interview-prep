package Threads;

public class Synchronizing {

    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + count.getCount());
    }
}

class Count {

    private  int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
