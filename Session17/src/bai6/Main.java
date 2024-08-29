package bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = 0 ;
        int dividend = 0 ;
        while (true){
            try {
                System.out.println("Enter divisor : ");
                divisor = Integer.parseInt(scanner.nextLine().trim());
                break;
            }catch (Exception e){
                System.err.println("Number invalid !");
            }
        }

        while (true){
            try {
                System.out.println("Enter dividend  : ");
                dividend= Integer.parseInt(scanner.nextLine().trim());
                break;
            }catch (Exception e){
                System.err.println("Number invalid !");
            }
        }
        if(dividend == 0){
            System.err.println("Error ! not division for 0 !");
        }else {
            int rs = divisor / dividend ;
            System.out.println("Result division " + divisor + "/" + dividend + " = " + rs);
        }
    }
}
