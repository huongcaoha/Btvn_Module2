package bai4;

import java.util.Random;

public class NumberGenerator implements Runnable{

    @Override
    public void run() {
        Random random = new Random();
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(random.nextInt(1,100) + " : " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
