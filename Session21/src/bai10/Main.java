package bai10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0 ;
        while (true){
            try {
                System.out.println("enter number : ");
                input = Integer.parseInt(scanner.nextLine().trim());
                if(input > 0){
                    break;
                }else {
                    System.err.println("Enter number > 0 !");
                }
            }catch (NumberFormatException e){
                System.err.println("Number invalid !");
            }
        }
        input *= 1000 ;
        int finalInput = input;
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(finalInput);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Tôi đã thức dậy sau khi ngủ " + finalInput/1000 + " giây !");
            }
        };
        thread.start();
    }
}
