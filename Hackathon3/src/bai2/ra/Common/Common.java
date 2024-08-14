package bai2.ra.Common;

import bai2.ra.Database.Data;

import java.util.Date;
import java.util.Scanner;

public class Common {
    public static int getInputInt(int number,String string){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println(string);
               number = Integer.parseInt(scanner.nextLine().trim());
               if(number >= 0){
                   break;
               }
            }catch (Exception e){
                System.err.println("Number invalid !");
            }
        }
        return number ;
    }


}
