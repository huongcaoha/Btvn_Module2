package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int a = 0  ,b = 0  ;
            while (true){
                try {
                    System.out.println("Enter number a : ");
                    a = Integer.parseInt(scanner.nextLine().trim());
                    break;
                }catch (NumberFormatException e){
                    System.err.println("Number invalid !");
                }
            }

        while (true){
            try {
                System.out.println("Enter number b : ");
                b = Integer.parseInt(scanner.nextLine().trim());
                break;
            }catch (NumberFormatException e){
                System.err.println("Number invalid !");
            }
        }
        int sum = a + b ;
        System.out.println("Sum of " + a + " + " + b + " = " + sum);
    }
}
