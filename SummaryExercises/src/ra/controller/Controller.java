package ra.controller;

import ra.Common.Common;
import ra.Common.Data;
import ra.depart.Department;
import ra.emp.Employee;

import java.util.Scanner;

public class Controller {
   static Scanner scanner = new Scanner(System.in);
    public static void displayDepartments(Department[] departments){
        System.out.printf("[ %-10s | %-50s | %-50s | %-15s | %-15s ]\n","Id","departName","description","phone","status");
        for(Department department : departments){
            if(department != null){
                department.displayData();
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void addDepartments(){
        int number = 0 ;
        number = Common.getInputInt(number,"Enter number department want add :");
        for(int i = 1 ; i <= number ; i++){
            System.out.println("Enter department " + i );
            Department department = new Department();
            department.inputData(scanner, Data.departments,Data.currentIndexDepartments);
            Data.currentIndexDepartments++ ;
            Data.departments[Data.currentIndexDepartments] = department;
        }
        System.out.println("Add " + number + " department successfully !");
        Controller.displayDepartments(Data.departments);
    }

    public static void updateDepartment(){
        int departmentId = 0 ;
        departmentId = Common.getInputInt(departmentId,"Enter department id : ");
        int index = -1 ;
        for(int i = 0 ; i <= Data.currentIndexDepartments ; i++){
            if(Data.departments[i].getDepartId() == departmentId){
                index = i ;
                break;
            }
        }
        if(index < 0 ){
            System.err.println("Not found department !");
        }else {
            Data.departments[index].updateData(scanner,Data.departments,Data.currentIndexDepartments);
            System.out.println("Update successfully !");
            Controller.displayDepartments(Data.departments);
        }
    }

    public static void deleteDepartment(){
        int departmentId = 0 ;
        departmentId = Common.getInputInt(departmentId,"Enter department id : ");
        int index = -1 ;
        for(int i = 0 ; i <= Data.currentIndexDepartments ; i++){
            if(Data.departments[i].getDepartId() == departmentId){
                index = i ;
                break;
            }
        }
        if(index < 0 ){
            System.err.println("Not found department !");
        }else {
            boolean checkDelete = true ;
            for(int i = 0 ; i <= Data.currentIndexEmployees ; i++){
                if(Data.employees[i].getDepartId() == departmentId){
                    checkDelete = false ;
                    break;
                }
            }
           if(!checkDelete){
               System.err.println("You cannot delete this department because this department existed employee !");
           }else {
               for(int i = index ; i < Data.currentIndexDepartments ; i++){
                   Department tmp = Data.departments[i];
                   Data.departments[i] = Data.departments[i+1];
                   Data.departments[i+1] = tmp ;
               }
               Data.departments[Data.currentIndexDepartments] = null ;
               Data.currentIndexDepartments-- ;
               System.out.println("Delete successfully !");
               Controller.displayDepartments(Data.departments);
           }
        }
    }

    public static void updateStatusDepartment(){
        int departmentId = 0 ;
        departmentId = Common.getInputInt(departmentId,"Enter department id : ");
        int index = -1 ;
        for(int i = 0 ; i <= Data.currentIndexDepartments ; i++){
            if(Data.departments[i].getDepartId() == departmentId){
                index = i ;
                break;
            }
        }
        if(index < 0 ){
            System.err.println("Not found department !");
        }else {
            if(Data.departments[index].getStatus()){
                Data.departments[index].setStatus(false);
            }else {
                Data.departments[index].setStatus(true);
            }
            System.out.println("Update status department " + departmentId+" successfully !");
            Controller.displayDepartments(Data.departments);
        }
    }

    public static void displayAllEmployees(Employee[] employees){
       if(Data.currentIndexEmployees < 0){
           System.out.println("List employee empty !");
       }else {
           System.out.printf("[ %-10s | %-40s | %-15s | %-15s | %-30s | %-10s | %-15s ]\n","EmpId","FullName","Gender","Birthday","Address","DepartId","Salary");
           for(Employee employee : employees){
               if(employee != null){
                   employee.displayData();
               }
           }
           System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }
    }
    public  static void addEmployees(){
        if(Data.currentIndexDepartments < 0){
            System.err.println("You need to create departments first !");
        }else {
            int number = 0 ;
            number = Common.getInputInt(number,"Enter number employee want add : ");
            for(int i = 1 ; i <= number ; i++){
                System.out.println("Enter employee " + i );
                Employee employee = new Employee();
                employee.inputData(scanner,Data.employees,Data.departments,Data.currentIndexEmployees,Data.currentIndexDepartments);
                Data.currentIndexEmployees++;
                Data.employees[Data.currentIndexEmployees] = employee;
            }
            System.out.println("Add successfully " + number + " employee !");
            displayAllEmployees(Data.employees);
        }
    }

    public static void sortEmployeeDecrease(){
        if(Data.currentIndexEmployees < 0){
            System.out.println("List employee empty !");
        }else {
            for(int i = 0 ; i < Data.currentIndexEmployees ; ){
                if(Data.employees[i].getSalary() < Data.employees[i+1].getSalary()){
                    Employee tmp = Data.employees[i];
                    Data.employees[i] = Data.employees[i+1];
                    Data.employees[i+1] = tmp ;
                    if(i > 0){
                        i-- ;
                    }
                }else {
                    i++ ;
                }
            }
            System.out.println("List employee after sort decrease is : ");
            displayAllEmployees(Data.employees);
        }
    }

    public static void updateEmployee(){
        System.out.println("Enter employ id to update : ");
        String idEmployee = scanner.nextLine().trim();
        int index = -1 ;
        for(int i = 0 ; i <= Data.currentIndexEmployees ; i++){
            if(Data.employees[i].getEmpId().equalsIgnoreCase(idEmployee)){
                index = i ;
                break;
            }
        }
        if(index < 0){
            System.err.println("Not found employee id !");
        }else {
            Data.employees[index].updateData(scanner,Data.employees,Data.departments,Data.currentIndexEmployees,Data.currentIndexDepartments);
            System.out.println("Update successfully employee id : "+idEmployee+" !");
            displayAllEmployees(Data.employees);
        }
    }

    public static void deleteEmployee(){
        System.out.println("Enter employ id to delete : ");
        String idEmployee = scanner.nextLine().trim();
        int index = -1 ;
        for(int i = 0 ; i <= Data.currentIndexEmployees ; i++){
            if(Data.employees[i].getEmpId().equalsIgnoreCase(idEmployee)){
                index = i ;
                break;
            }
        }
        if(index < 0){
            System.err.println("Not found employee id !");
        }else {
            for(int i = index ; i < Data.currentIndexEmployees ; i++){
                Data.employees[i] = Data.employees[i+1];
            }
            Data.employees[Data.currentIndexEmployees] = null ;
            Data.currentIndexEmployees-- ;
            System.out.println("Delete successfully employee id : "+idEmployee+" !");
            displayAllEmployees(Data.employees);
        }
    }

    public static String getNameDepartmentById(int id){
        for(int i = 0 ; i <= Data.currentIndexDepartments ; i++){
            if(Data.departments[i].getDepartId() == id){
                return Data.departments[i].getDepartName();
            }
        }
        return "" ;
    }
    public static void searchEmployeeByDepartmentName(){
        System.out.println("Enter department name : ");
        String departmentName = scanner.nextLine().trim();
        Employee[] rs = new Employee[100];
        int currentIndexRs = -1 ;
        for(int i = 0 ; i <= Data.currentIndexEmployees ; i++){
           String namedpm = getNameDepartmentById(Data.employees[i].getDepartId());
           if(namedpm != ""){
               if(namedpm.equalsIgnoreCase(departmentName)){
                   currentIndexRs++;
                   rs[currentIndexRs] = Data.employees[i];
               }
           }
        }
       if(currentIndexRs < 0){
           System.out.println("Not found employee by : " + departmentName);
       }else {
           System.out.println("Result search department name : " + departmentName);
           displayAllEmployees(rs);
       }
    }

    public static void searchEmployeeBySalary(){
        double minSalary = 0 ;
        minSalary = Common.getInputDouble(minSalary,"Enter min salary :");

        double maxSalary = 0 ;
        maxSalary = Common.getInputDouble(maxSalary,"Enter max salary : ");
        Employee[] rs = new Employee[100];
        int currentIndexRs = -1 ;
        for(int i = 0 ; i <= Data.currentIndexEmployees ; i++){
           if(Data.employees[i].getSalary() >= maxSalary && Data.employees[i].getSalary() <= maxSalary){
               currentIndexRs++ ;
               rs[currentIndexRs] = Data.employees[i];
           }
        }
        if(currentIndexRs < 0){
            System.out.printf("Not found employee by salary : %.2f ->  %.2f !\n",minSalary,maxSalary);
        }else {
            System.out.printf("Result search employee by salary : %.2f ->  %.2f !\n",minSalary,maxSalary);
            displayAllEmployees(rs);
        }
    }
}
