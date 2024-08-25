package bai3.service;

import bai3.IInterface.ICRUD;
import bai3.database.Database;
import bai3.entity.Department;

import java.util.List;
import java.util.Scanner;

public class DepartmentService implements ICRUD<Department> {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void displayList(List<Department> list) {
        if(list.isEmpty()){
            System.err.println("List department empty !");
        }else {
            System.out.println("********************************** List Department ************************************");
            for (Department department : list){
                System.out.println(department.toString());
            }
        }
    }

    @Override
    public boolean add() {
        int number  = 0 ;
        while (true){
            try {
                System.out.println("Enter number department want add :");
                number = Integer.parseInt(scanner.nextLine().trim());
                if(number > 0){
                    break;
                }else {
                    System.err.println("Enter  number > 0 !");
                }
            }catch (Exception e){
                System.out.println("Number invalid !");
            }
        }
        for(int i = 1 ; i <= number ; i++){
            System.out.println("Enter department number " + i );
            Department department = new Department();
            department.inputData(scanner, Database.departments);
            Database.departments.add(department);
        }
        System.out.println("Add successfully " + number + " department !") ;
        displayList(Database.departments);
        return true ;
    }

    @Override
    public boolean update() {
        String departmentId = "" ;
        while (true){
            System.out.println("Enter department id to update : ");
            departmentId = scanner.nextLine().trim();
            if(departmentId.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
        int index = -1 ;
        for(int i = 0 ; i < Database.departments.size() ; i++){
            if(Database.departments.get(i).getDepartmentId().equalsIgnoreCase(departmentId)){
                index = i ;
                break;
            }
        }
        if(index == -1 ){
            System.err.println("Not found department !");
            return false ;
        }else {
            Database.departments.get(index).updateData(scanner,Database.departments);
            System.out.println("Update department successfully !");
            displayList(Database.departments);
            return true ;
        }
    }

    @Override
    public boolean delete() {
        String departmentId = "" ;
        while (true){
            System.out.println("Enter department id to delete : ");
            departmentId = scanner.nextLine().trim();
            if(departmentId.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
        int index = -1 ;
        for(int i = 0 ; i < Database.departments.size() ; i++){
            if(Database.departments.get(i).getDepartmentId().equalsIgnoreCase(departmentId)){
                index = i ;
                break;
            }
        }
        if(index == -1 ){
            System.err.println("Not found department !");
            return false ;
        }else {
           Database.departments.remove(index);
            System.out.println("Delete department successfully !");
            displayList(Database.departments);
            return true ;
        }
    }

    public void displayEmployeeByDepartmentId(){
        String departmentId = "" ;
        while (true){
            System.out.println("Enter department id to search employee  : ");
            departmentId = scanner.nextLine().trim();
            if(departmentId.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
        int index = -1 ;
        for(int i = 0 ; i < Database.departments.size() ; i++){
            if(Database.departments.get(i).getDepartmentId().equalsIgnoreCase(departmentId)){
                index = i ;
                break;
            }
        }
        if(index == -1 ){
            System.err.println("Not found department !");
        }else {
            System.out.println("List employee search by department id " + departmentId + " : ");
            int count = 0 ;
            for(int i = 0 ; i < Database.employees.size() ; i++){
                if(Database.employees.get(i).getDepartment().getDepartmentId().equalsIgnoreCase(departmentId)){
                    System.out.println(Database.employees.get(i));
                    count++ ;
                }
            }
            if(count == 0 ){
                System.err.println("This department has no employee !");
            }else {
                System.out.println("This department has "+ count + " employee !");
            }
        }
    }
}
