package bai3;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for(int i = 1 ; i <= 100 ; i++){
                    if(i % 2 == 1){
                        System.out.println("Thread1 : " + i);
                    }
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                for(int i = 1 ; i <= 100 ; i++){
                    if(i % 2 == 0){
                        System.out.println("Thread2 : " + i);
                    }
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}
