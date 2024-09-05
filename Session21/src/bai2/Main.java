package bai2;

public class Main {
    public static void main(String[] args) {
        int sum = 0 ;
        Thread thread = new Thread(){
            @Override
            public void run() {
                for(int i = 1 ; i <= 1000 ; i++){
                    Sum.setRs(i);
                }
                System.out.println("Done !");
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Rs = : " + Sum.rs);
            }
        };

        thread.start();
        thread2.start();
    }
}
