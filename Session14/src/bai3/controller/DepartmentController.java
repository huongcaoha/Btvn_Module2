package bai3.controller;

import bai3.service.DepartmentService;
import bai3.service.EmployeeService;

import java.util.Scanner;

public class DepartmentController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DepartmentService  departmentService = new DepartmentService();
        while (true){
            System.out.println("****************************Department Management******************************");
            System.out.println("*                  1. Display all department                                                                                  *");
            System.out.println("*                  2. Add new department                                                                                     *");
            System.out.println("*                  3. Update department                                                                                        *");
            System.out.println("*                  4. Display all employee by department                                                          *");
            System.out.println("*                  5. Delete department                                                                                          *");
            System.out.println("*                  6. Exit                                                                                                                      *");
            System.out.println("***************************************************************************************");
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

                    break;
                }
                case 2 : {
                    break;
                }
                case 3 : {
                    break;
                }
                case 4 : {
                    break;
                }
                case 5 : {
                    break;
                }
                case 6 : {
                    return;
                }
                default: {
                    System.err.println("Enter choice from 1 to 6 !");
                }
            }
        }
    }
}
