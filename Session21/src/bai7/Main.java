package bai7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                Random random = new Random();
                System.out.println(random.nextInt(0,100));
            }
        };
        thread.start();
    }
}
