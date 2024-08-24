package bai3.entity;

import java.util.List;
import java.util.Scanner;

public class Department {
    private String departmentId ;
    private String departmentName ;
    private Integer totalMembers ;

    public Department() {
    }


    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(Integer totalMembers) {
        this.totalMembers = totalMembers;
    }

    public void inputData(Scanner scanner , List<Department> departments){
        inputDepartmentId(scanner,departments);

        inputDepartmentName(scanner, departments);

        inputTotalMembers(scanner);

    }

    public void updateData(Scanner scanner , List<Department> departments){

        inputDepartmentName(scanner, departments);

        inputTotalMembers(scanner);

    }

    private void inputTotalMembers(Scanner scanner) {
        while (true){
            try {
                System.out.println("Enter total members in department : ");
                totalMembers = Integer.parseInt(scanner.nextLine().trim());
                if(totalMembers > 0){
                    break;
                }else {
                    System.err.println("Enter number > 0 !");
                }
            }catch (Exception e){
                System.err.println("Input invalid !");
            }
        }
    }

    private void inputDepartmentName(Scanner scanner, List<Department> departments) {
        while (true){
            System.out.println("Enter department name :");
            departmentName = scanner.nextLine().trim();
            if(departmentName.length() > 0){
                if(departments.isEmpty()){
                    break;
                }
                boolean isCheck = false ;
                for(Department d : departments){
                    if(d.getDepartmentName().equalsIgnoreCase(departmentName)){
                        isCheck = true ;
                        break;
                    }
                }
                if(isCheck){
                    System.err.println("Department name existed !");
                }else {
                    break;
                }
            }else {
                System.err.println("Cannot be left blank !");
            }
        }
    }

    private void inputDepartmentId(Scanner scanner, List<Department> departments) {
        while (true){
            System.out.println("Enter department id (no duplicates, starts with the letter D and has exactly 4 characters.): ");
            departmentId = scanner.nextLine().trim();
            if(departmentId.matches("^D\\w{3}$")){
                if(departments.isEmpty()){
                    break;
                }else {
                    boolean isCheck = false ;
                    for(Department d : departments){
                        if(d.getDepartmentId().equals(departmentId)){
                            isCheck = true ;
                            break;
                        }
                    }
                    if(isCheck){
                        System.err.println("Department Id existed !");
                    }else {
                        break;
                    }
                }
            }else {
                System.err.println(" Department id no duplicates, starts with the letter D and has exactly 4 characters.");
            }
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", totalMembers=" + totalMembers +
                '}';
    }
}
