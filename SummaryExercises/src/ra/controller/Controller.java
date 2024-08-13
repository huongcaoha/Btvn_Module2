package ra.controller;

import ra.depart.Department;

public class Controller {
    public static void displayDepartments(Department[] departments){
        System.out.printf("| %-10s | %-50s | %-50s | %-15s | %-15s |\n","Id","departName","description","phone","status");
        for(Department department : departments){
            if(department != null){
                department.displayData();
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
