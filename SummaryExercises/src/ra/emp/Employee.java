package ra.emp;


import ra.Common.Data;
import ra.controller.Controller;
import ra.depart.Department;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {
    private String empId ;
    private String fullName ;
    private Boolean gender ;
    private Date birthday ;
    private String address ;
    private Integer departId ;
    private double salary ;

    public Employee() {
    }

    public Employee(String empId, String fullName, Boolean gender, Date birthday, String address, Integer departId, double salary) {
        this.empId = empId;
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.departId = departId;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData(Scanner scanner, Employee[] arrEmployees, Department[] arrDepartments, int empIndex, int departIndex){
       if(departIndex < 0){
           System.err.println("You must add departments first !");
       }else {
           while (true){
               System.out.println("Enter empID (Employee code – 4 characters - starts with E – No duplicates) :");
               empId = scanner.nextLine().trim();
               if(empId.matches("^E\\w{3}$")){
                   Boolean checkId = false ;
                   for(int i = 0 ; i <= empIndex ; i++){
                       if(arrEmployees[i].getEmpId().toLowerCase().equals(empId.toLowerCase())){
                           checkId = true ;
                           break;
                       }
                   }
                   if(checkId){
                       System.err.println("Employee id exis !");
                   }else {
                       break;
                   }
               }else {
                   System.err.println("Employee code – 4 characters - starts with E – No duplicates !");
               }
           }

           while (true){
               System.out.println("Enter full name : ");
               fullName = scanner.nextLine().trim();
               if(fullName.length() >= 2){
                   break;
               }else {
                   System.err.println("Length full name >= 2 !");
               }
           }

           while (true){
               try {
                   System.out.println("Enter genger (true : male ; false : female) :");
                   gender = Boolean.parseBoolean(scanner.nextLine().trim());
                   break;
               }catch (Exception e){
                   System.err.println("Please enter true or false !");
               }
           }

           while (true){
               System.out.println("Enter birthday (dd/MM/yy):  ");
               String birthday = scanner.nextLine().trim();
               SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
               try {
                   this.birthday = simpleDateFormat.parse(birthday);
                   if(birthday.matches("^[0-3][0-9]/[01][0-9]/[12][0-9][0-9][0-9]$")){
                       break;
                   }else {
                       System.err.println("Birthday invalid !");
                   }
               }catch (Exception e){
                   System.out.println("Birthday invalid !");
               }
           }

           while (true){
               System.out.println("Enter address  :");
               address = scanner.nextLine().trim();
               if(address.length() >= 2){
                   break;
               }else {
                   System.err.println("Enter length address >= 2 !");
               }
           }

           while (true) {
               Controller.displayDepartments(Data.departments);
               try {
                   System.out.println("Enter departId : ");
                   departId = Integer.parseInt(scanner.nextLine().trim());
               }catch (Exception e){
                   System.err.println("Department id invalid !");
               }
               boolean check = false ;
               for(int i = 0 ; i <= departIndex ; i++){
                   if(arrDepartments[i].getDepartId() == departId){
                       check = true ;
                       break;
                   }
               }
               if(check){
                   break;
               }else {
                   System.err.println("Not found department id !");
               }
           }

           while (true){
               try {
                   System.out.println("Enter salary :");
                   salary = Double.parseDouble(scanner.nextLine().trim());
                   if(salary > 0){
                       break;
                   }else {
                       System.err.println("Salary > 0 !");
                   }
               }catch (Exception e){
                   System.err.println("Salary invalid !");
               }
           }

       }
    }

    public void updateData(Scanner scanner, Employee[] arrEmployees, Department[] arrDepartments, int empIndex, int departIndex){
        if(departIndex < 0){
            System.err.println("Update employee error !  You must add departments first !");
        }else {

            while (true){
                System.out.println("Enter full name : ");
                fullName = scanner.nextLine().trim();
                if(fullName.length() >= 2){
                    break;
                }else {
                    System.err.println("Length full name >= 2 !");
                }
            }

            while (true){
                try {
                    System.out.println("Enter genger (true : male ; false : female) :");
                    gender = Boolean.parseBoolean(scanner.nextLine().trim());
                    break;
                }catch (Exception e){
                    System.err.println("Please enter true or false !");
                }
            }

            while (true){
                System.out.println("Enter birthday (dd/MM/yy):  ");
                String birthday = scanner.nextLine().trim();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    this.birthday = simpleDateFormat.parse(birthday);
                    if(birthday.matches("^[0-3][0-9]/[01][0-9]/[12][0-9][0-9][0-9]$")){
                        break;
                    }else {
                        System.err.println("Birthday invalid !");
                    }
                }catch (Exception e){
                    System.out.println("Birthday invalid !");
                }
            }

            while (true){
                System.out.println("Enter address  :");
                address = scanner.nextLine().trim();
                if(address.length() >= 2){
                    break;
                }else {
                    System.err.println("Enter length address >= 2 !");
                }
            }

            while (true) {
                Controller.displayDepartments(Data.departments);
                try {
                    System.out.println("Enter departId : ");
                    departId = Integer.parseInt(scanner.nextLine().trim());
                }catch (Exception e){
                    System.err.println("Department id invalid !");
                }
                boolean check = false ;
                for(int i = 0 ; i <= departIndex ; i++){
                    if(arrDepartments[i].getDepartId() == departId){
                        check = true ;
                        break;
                    }
                }
                if(check){
                    break;
                }else {
                    System.err.println("Not found department id !");
                }
            }

            while (true){
                try {
                    System.out.println("Enter salary :");
                    salary = Double.parseDouble(scanner.nextLine().trim());
                    if(salary > 0){
                        break;
                    }else {
                        System.err.println("Salary > 0 !");
                    }
                }catch (Exception e){
                    System.err.println("Salary invalid !");
                }
            }

        }
    }

    public void displayData(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("[ %-10s | %-40s | %-15s | %-15s | %-30s | %-10d | %-15.2f ]\n",empId,fullName,gender? "male" : "female",simpleDateFormat.format(birthday),address,departId,salary);
    }

    public static void main(String[] args) {
      String x = "abc";
      String y = "abc";
     x= x.concat(y);
        System.out.println(x);
    }
}
