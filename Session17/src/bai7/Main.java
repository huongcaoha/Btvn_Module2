package bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0 , b = 0 ;
        while (true){
            try {
                System.out.println("Enter a : ");
                a = Integer.parseInt(scanner.nextLine().trim());
                break;
            }catch (Exception e){
                System.err.println("Number invalid !");
            }
        }

        while (true){
            try {
                System.out.println("Enter b : ");
                b = Integer.parseInt(scanner.nextLine().trim());
                break;
            }catch (Exception e){
                System.err.println("Number invalid !");
            }
        }
        if(a > b){
            System.out.println(" a > b !");
        }else if (a < b ) {
            System.out.println("a < b !");
        }else {
            System.out.println("a = b !");
        }
    }
}
