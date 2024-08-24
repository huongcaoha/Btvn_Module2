package bai3.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private String employeeId ;
    private String employeeName ;
    private LocalDate birthday ;
    private Boolean sex;
    private Double salary ;
    private Employee manager ;
    private Department department ;

    public Employee() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public void inputData(Scanner scanner , List<Employee> employees , List<Department> departments){
        if(departments.isEmpty()){
            System.err.println("Department is empty , Please add departments before adding employees !");
        }else {
            inputEmployeeId(scanner, employees);

            inputEmployeeName(scanner);

            inputBirthday(scanner);

            inputSex(scanner);

            inputSalary(scanner);

            inputManager(scanner, employees);

            inputDepartment(scanner, departments);
        }
    }

    public void updateData(Scanner scanner , List<Employee> employees , List<Department> departments){
        if(departments.isEmpty()){
            System.err.println("Department is empty , Please add departments before adding employees !");
        }else {

            inputEmployeeName(scanner);

            inputBirthday(scanner);

            inputSex(scanner);

            inputSalary(scanner);

            inputManager(scanner, employees);

            inputDepartment(scanner, departments);
        }
    }
    private void inputDepartment(Scanner scanner, List<Department> departments) {
        while (true){
            System.out.println("List department : ");
            for(Department d : departments){
                System.out.println(d.toString());
            }
            System.out.println("Enter department id : ");
            String departmentId = scanner.nextLine().trim();
            if(departmentId.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                boolean isCheck = false ;
                for(Department d : departments){
                    if(d.getDepartmentId().equalsIgnoreCase(departmentId)){
                        isCheck =true ;
                        department = d ;
                        break;
                    }
                }
                if(isCheck){
                    break;
                }else {
                    System.err.println("Not found department id !");
                }
            }
        }
    }

    private void inputManager(Scanner scanner, List<Employee> employees) {
        while (true){
            System.out.println("List Employee :");
            for(Employee e : employees){
                System.out.println(e.toString());
            }
            System.out.println("Enter manager id (can enter null): ");
            String managerId = scanner.nextLine().trim();
            if(managerId.equalsIgnoreCase("null")){
                manager = null ;
                break;
            }else {
                boolean isCheck = false ;
                for(Employee e : employees){
                    if(e.getEmployeeId().equalsIgnoreCase(managerId)){
                        isCheck = true ;
                        manager = e ;
                        break;
                    }
                }
                if(isCheck){
                    break;
                }else {
                    System.err.println("Not found id !");
                }
            }
        }
    }

    private void inputSalary(Scanner scanner) {
        while (true){
            try {
                System.out.println("Enter salary : ");
                salary = Double.parseDouble(scanner.nextLine().trim());
                if(salary > 0){
                    break;
                }else {
                    System.err.println("Enter salary > 0 !");
                }
            }catch (Exception e){
                System.err.println("Salary invalid !");
            }
        }
    }

    private void inputSex(Scanner scanner) {
        while (true){
            System.out.println("Enter sex (true : male or false : female): ");
            String gender = scanner.nextLine().trim().toLowerCase();
            if(gender.equals("true") || gender.equals("false")){
                try {
                    sex = Boolean.parseBoolean(gender);
                    break;
                }catch (Exception e){
                    System.out.println("Enter true or false !");
                }
            }else {
                System.err.println("Please enter true or false !");
            }
        }
    }

    private void inputBirthday(Scanner scanner) {
        while (true){
            try {
                System.out.println("Enter birtday (dd/MM/yyyy) : ");
                String dob = scanner.nextLine().trim();
                if(dob.matches("^[0-3][0-9]/[01][0-9]/[12][0-9]{3}$")){
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    birthday = LocalDate.parse(dob,dateTimeFormatter);
                    break;
                }else {
                    System.err.println("Birthday invalid !");
                }
            }catch (Exception e){
                System.out.println("Birthday invalid !");
            }
        }
    }

    private void inputEmployeeName(Scanner scanner) {
        while (true){
            System.out.println("Enter employee name :");
            employeeName = scanner.nextLine().trim();
            if(employeeName.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
    }

    private void inputEmployeeId(Scanner scanner, List<Employee> employees) {
        while (true){
            System.out.println("Enter employee id : (no duplicates, starts with the letter E and has exactly 5 characters) : ");
            employeeId = scanner.nextLine().trim();
            if(employeeId.matches("^E\\w{4}$")){
                boolean isCheck = false ;
                for(Employee e : employees){
                    if(e.getEmployeeId().equals(employeeId)){
                        isCheck = true ;
                        break;
                    }
                }
                if (isCheck){
                    System.err.println("Employee id existed !");
                }else {
                    break;
                }
            }else {
                System.err.println("Employee id no duplicates, starts with the letter E and has exactly 5 characters !");
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", salary=" + salary +
                ", manager=" + manager +
                ", department=" + department.getDepartmentName() +
                '}';
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Department department = new Department();
//        department.inputData(scanner,Database.departments);
//        Database.departments.add(department);
//
//        Employee employee = new Employee();
//        employee.inputData(scanner,Database.employees,Database.departments);
//        Database.employees.add(employee);
//        System.out.println("List Department :");
//        for(Department d : Database.departments){
//            System.out.println(d.toString());
//        }
//        System.out.println();
//        System.out.println("List Employee :");
//        for(Employee e : Database.employees){
//            System.out.println(e.toString());
//        }
//    }
}
