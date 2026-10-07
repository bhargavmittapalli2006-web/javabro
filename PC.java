class SharedBuffer {
    boolean empty = false;
    int items;
    public synchronized void producer(int n) throws InterruptedException {
        while (empty) {
            System.out.println("Buffer is full, producer has to wait");
            wait();
        }
        items = n;
        System.out.println("Produced: " + items);

        empty = true;
        notify();
    }
    public synchronized int consumer() throws InterruptedException {
        while (!empty) {
            System.out.println("Buffer is empty! Consumer has to wait");
            wait();
        }
        empty = false;
        System.out.println("Consumed: " + items);
        notify();
        return items;
    }
}
class Producer implements Runnable {
    SharedBuffer b;
    int totalitems;
    public Producer(SharedBuffer b, int totalitems) {
        this.b = b;
        this.totalitems = totalitems;
    }
    public void run() {
        for (int i = 0; i < totalitems; i++) {
            try {
                b.producer(i);
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Consumer implements Runnable {
    SharedBuffer b;
    int totalitems;
    public Consumer(SharedBuffer b, int totalitems) {
        this.b = b;
        this.totalitems = totalitems;
    }
    public void run() {
        for (int i = 0; i < totalitems; i++) {
            try {
                b.consumer();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class PC {
    public static void main(String args[]) throws InterruptedException {
        int total = 10;
        SharedBuffer sb = new SharedBuffer();
        Thread t1 = new Thread(new Producer(sb, total));
        Thread t2 = new Thread(new Consumer(sb, total));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Produced & Consumed " + total + " items");
    }
}