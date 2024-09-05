package bai9;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                for(int i = 10 ; i > 0 ; i--){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread.start();
    }
}
