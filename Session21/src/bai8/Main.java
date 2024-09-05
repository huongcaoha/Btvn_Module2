package bai8;

public class Main {
    public static Integer tmp = 14 ;
    public static void main(String[] args) {

        Thread thread1 = new Thread(){
            @Override
            public void run() {
              while (true){
                  tmp++ ;
                  System.out.println("Thread 1 : " + tmp);
                  if(tmp == 20){
                      System.out.println("Thread 1 : Win");
                  }
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
               while (true){
                   tmp-- ;
                   System.out.println("Thread 2 : " + tmp);
                   if(tmp == 10){
                       System.out.println("Thread 2 : Win");
                   }
                   try {
                       Thread.sleep(500);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
            }
        };
        thread1.start();
        thread2.start();
    }
}
