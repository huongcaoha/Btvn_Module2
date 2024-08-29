package bai15;

import bai1.Common;

public class Main {
    public static void main(String[] args) {
      int sideA = 0 , sideB = 0 , sideC = 0 ;
      while (true){
         try {
             System.out.println("Enter side A : ");
             sideA = Integer.parseInt(Common.scanner.nextLine().trim());
             if(sideA < 0){
                 System.err.println("Enter side A > 0 !");
             }else {
                 break;
             }
         }catch (Exception e){
             Exception IllegalTriangleException;
         }
      }

        while (true){
            try {
                System.out.println("Enter side B : ");
                sideB = Integer.parseInt(Common.scanner.nextLine().trim());
                if(sideB < 0){
                    System.err.println("Enter side B > 0 !");
                }else {
                    break;
                }
            }catch (Exception e){
                Exception IllegalTriangleException;
            }
        }

        while (true){
            try {
                System.out.println("Enter side C : ");
                sideC = Integer.parseInt(Common.scanner.nextLine().trim());
                if(sideC < 0 && (sideC + sideB) < sideA){
                    System.err.println("Enter side A > 0 ! sum two side > side remaining !");
                }else {
                    break;
                }
            }catch (Exception e){
                Exception IllegalTriangleException;
            }
        }

    }
}
