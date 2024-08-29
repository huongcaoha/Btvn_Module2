package bai1;

import java.util.Scanner;

public class Common {
    public static Scanner scanner = new Scanner(System.in);

    public static int getNumber(String label){
        int number = 0 ;
        while (true){
            try {
                System.out.println(label);
                number = Integer.parseInt(scanner.nextLine().trim());
                break;
            }catch (NumberFormatException e){
                System.err.println("Number invalid !");
            }
        }
        return number ;
    }
}
