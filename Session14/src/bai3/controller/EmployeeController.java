package bai3.controller;

import bai3.database.Database;
import bai3.service.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        while (true){
            System.out.println("****************************Employee Management******************************");
            System.out.println("*                  1. Display all employee                                                                                  *");
            System.out.println("*                  2. Display employee detail                                                                            *");
            System.out.println("*                  3. Add employee                                                                                              *");
            System.out.println("*                  4. Update employee                                                                                        *");
            System.out.println("*                  5. Delete department                                                                                      *");
            System.out.println("*                  6. Statistics average number of employees per department              *");
            System.out.println("*                  7. Find 5 departments with the largest number of employees            *");
            System.out.println("*                  8. Find out who manages the most employees                                       *");
            System.out.println("*                  9. Find out the 5 oldest employees in the company                               *");
            System.out.println("*                10. Find the 5 highest paid employees                                                        *");
            System.out.println("*                 11. Exit                                                                                                                 *");
            System.out.println("*************************************************************************************");
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
                    employeeService.displayList(Database.employees);
                    break;
                }
                case 2 : {
                    employeeService.employeeDetail();
                    break;
                }
                case 3 : {
                    if(Database.departments.isEmpty()){
                        System.err.println("No departments found, please add a department first !");
                    }else {
                        employeeService.add();
                    }
                    break;
                }
                case 4 : {
                    employeeService.update();
                    break;
                }
                case 5 : {
                    employeeService.delete();
                    break;
                }
                case 6 : {
                    employeeService.statisticAvgEmployee();
                    break;
                }
                case 7 : {
                    employeeService.get5DepartmentMostEmployee();
                    break;
                }
                case 8 : {
                    employeeService.searchManagerMostEmployee();
                    break;
                }
                case 9 : {
                    employeeService.get5EmployeeMostAge();
                    break;
                }
                case 10 : {
                    employeeService.get5EmployeeMostSalary();
                    break;
                }
                case 11 : {
                    return;
                }
                default: {
                    System.err.println("Please enter choice from 1 to 11 !");
                }
            }
        }
    }
}
