package bai5;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        evenThread.start();
    }
}
