package bai1;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                for(int i = 1 ; i <= 10 ; i++){
                    System.out.println(i);
                    if(i == 10){
                        System.out.println("End !");
                    }
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
