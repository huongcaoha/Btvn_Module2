package ra.run;

import ra.common.IMethod;

import java.util.Scanner;

public class ShopManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.println("*********************************** Shop Menu **********************************");
                System.out.println("*                                                                                                                                                               *");
                System.out.println("*                                                     1. Category management                                                       *");
                System.out.println("*                                                     2. Product management                                                          *");
                System.out.println("*                                                     3. Exit                                                                                              *");
                System.out.println("*                                                                                                                                                               *");
                System.out.println("**********************************************************************************");

                int choice = 0 ;
                choice = IMethod.getNumber(scanner,choice,"Enter choice : ");
                switch (choice){
                    case 1 : {
                        CategoryManagement.main(args);
                        break;
                    }
                    case 2 : {
                        ProductManagement.main(args);
                        break;
                    }
                    case 3 : {
                        System.out.println("Goodbye !!!");
                        return;
                    }
                    default: {
                        System.err.println("Enter choice from 1 to 3 !");
                    }
                }
            }
    }
}
