package bai3.service;

import bai3.IInterface.ICRUD;
import bai3.database.Database;
import bai3.entity.Department;
import bai3.entity.Employee;

import java.time.LocalDate;
import java.util.*;

public class EmployeeService implements ICRUD<Employee> {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void displayList(List<Employee> list) {
        if(list.isEmpty()){
            System.err.println("List employee is empty !");
        }else {
            System.out.println("------------------------------------------------ List Employee -------------------------------------------------");
            for(Employee e : list){
                System.out.println(e.toString());
            }
        }
    }

    @Override
    public boolean add() {
        int number = 0 ;
        while (true){
            try {
                System.out.println("Enter number employee want add : ");
                 number = Integer.parseInt(scanner.nextLine().trim());
                if(number > 0){
                    break;
                }else {
                    System.err.println("Enter number > 0 !");
                }
            }catch (Exception e ){
                System.err.println("Number invalid !");
            }
        }
        for(int i = 1 ; i <= number ; i++){
            System.out.println("Enter employee " + i );
            Employee employee = new Employee() ;
            employee.inputData(scanner, Database.employees,Database.departments);
            Database.employees.add(employee);
        }
        System.out.println("Add successfully " + number + " employee !");
        return true ;
    }

    @Override
    public boolean update() {
        String employeeId = "" ;
        while (true){
            System.out.println("Enter employee id to update : ");
            employeeId = scanner.nextLine().trim();
            if(employeeId.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
        int index = -1 ;
        for(int i = 0 ; i < Database.employees.size() ; i++){
            if(Database.employees.get(i).getEmployeeId().equalsIgnoreCase(employeeId)){
                index = i ;
                break;
            }
        }
        if(index >= 0){
            Database.employees.get(index).updateData(scanner,Database.employees,Database.departments);
            System.out.println("Update employee successfully !");
            displayList(Database.employees);
            return true ;
        }else {
            System.out.println("Not found employee id , update error !");
            return false ;
        }

    }

    @Override
    public boolean delete() {
        String employeeId = "" ;
        while (true){
            System.out.println("Enter employee id to update : ");
            employeeId = scanner.nextLine().trim();
            if(employeeId.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
        int index = -1 ;
        for(int i = 0 ; i < Database.employees.size() ; i++){
            if(Database.employees.get(i).getEmployeeId().equalsIgnoreCase(employeeId)){
                index = i ;
                break;
            }
        }
        if(index >= 0){
           Database.employees.remove(index);
            System.out.println("Delete employee successfully !");
            displayList(Database.employees);
            return true ;
        }else {
            System.out.println("Not found employee id , delete error !");
            return false ;
        }

    }

    public void employeeDetail(){
        String employeeId = "" ;
        while (true){
            System.out.println("Enter employee id to update : ");
            employeeId = scanner.nextLine().trim();
            if(employeeId.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
        int index = -1 ;
        for(int i = 0 ; i < Database.employees.size() ; i++){
            if(Database.employees.get(i).getEmployeeId().equalsIgnoreCase(employeeId)){
                index = i ;
                break;
            }
        }
        if(index >= 0){
            System.out.println( Database.employees.get(index).toString());
        }else {
            System.err.println("Not found employee id !");
        }
    }

    public void statisticAvgEmployee(){
        int avg = Database.departments.stream().mapToInt(Department::getTotalMembers).sum() / Database.departments.size();
        System.out.println("Average of each department  is : " + avg + " employee !");
    }

    public void get5DepartmentMostEmployee(){
        List<Department> departmentArranged = Database.departments.stream().sorted((a,b) -> b.getTotalMembers().compareTo(a.getTotalMembers())).toList();
        System.out.println("List 5 department have most employee : ");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(Database.departments.get(i).toString());
        }
    }

    public void searchManagerMostEmployee(){
        Map<String,Integer> listManager = new HashMap<>();
        for(Employee e : Database.employees){
            if(e.getManager() != null){
                String empName = e.getManager().getEmployeeName();
                if(listManager.containsKey(empName)){
                    listManager.put(empName,listManager.get(empName)+1);
                }else {
                    listManager.put(empName,1);
                }
            }
        }

        int number  = 0 ;
        String nameEmployee = "" ;
        for(Map.Entry<String, Integer> emp : listManager.entrySet()){
            if(emp.getValue() > number){
                number = emp.getValue();
                nameEmployee = emp.getKey();
            }
        }
        System.out.println("Manager have most employee is " + nameEmployee +" : " + number + " employee !" );
    }

    public void get5EmployeeMostAge(){
       List<Employee> newEmployees = Database.employees.stream().sorted((a,b) -> (LocalDate.now().getYear() - b.getBirthday().getYear()) - (LocalDate.now().getYear() - a.getBirthday().getYear()) ).toList();
        System.out.println("5 Employee most age : ");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(newEmployees.get(i).toString());
        }
    }

    public void get5EmployeeMostSalary(){
        List<Employee> newEmployees = Database.employees.stream().sorted((a,b) -> b.getSalary().compareTo(a.getSalary())).toList();
        System.out.println("5 Employee most salary  : ");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(newEmployees.get(i).toString());
        }
    }
}
