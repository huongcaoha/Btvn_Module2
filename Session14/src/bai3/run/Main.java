package bai3.run;

import bai3.controller.DepartmentController;
import bai3.controller.EmployeeController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("*************************************** Management System Main *****************************************");
            System.out.println("*                                                                                                                                                                                             *");
            System.out.println("*                                                             1. Employee management system                                                                *");
            System.out.println("*                                                             2. Department management system                                                            *");
            System.out.println("*                                                             3. Exit                                                                                                                     *");
            System.out.println("*                                                                                                                                                                                             *");
            System.out.println("**************************************************************************************************************");
            int choice = 0  ;
            while (true){
                try {
                    System.out.println("Enter choice :");
                    choice = Integer.parseInt(scanner.nextLine().trim());
                    if(choice > 0){
                        break;
                    }else {
                        System.err.println("Enter choice > 0 !");
                    }
                }catch (Exception e){
                    System.err.println("Choice invalid !");
                }
            }
            switch (choice){
                case 1 : {
                    EmployeeController.main(args);
                    break;
                }
                case 2 : {
                   DepartmentController.main(args);
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
