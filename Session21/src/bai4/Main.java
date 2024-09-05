package bai4;

public class Main {
    public static void main(String[] args) {
        NumberGenerator thread1 = new NumberGenerator();
        NumberGenerator thread2 = new NumberGenerator();
        Thread t1 = new Thread(thread1);
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(thread2);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
