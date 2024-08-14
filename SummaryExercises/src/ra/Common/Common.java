package ra.Common;

import java.util.Scanner;

public class Common {
    public static int getInputInt(int number,String string){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println(string);
                number = Integer.parseInt(scanner.nextLine().trim());
                if(number > 0){
                    break;
                }
            }catch (Exception e){
                System.err.println("Number invalid !");
            }
        }
        return number ;
    }

    public static double getInputDouble(double number,String string){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println(string);
                number = Double.parseDouble(scanner.nextLine().trim());
                if(number > 0){
                    break;
                }
            }catch (Exception e){
                System.err.println("Number invalid !");
            }
        }
        return number ;
    }
}
