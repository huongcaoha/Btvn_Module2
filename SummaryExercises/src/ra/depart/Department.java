package ra.depart;

import java.util.Scanner;

public class Department {
    private Integer departId ;
    private String departName ;
    private String description ;
    private String phone ;
    private Boolean status ;

    public Department() {
    }

    public Department(Integer departId, String departName, String description, String phone, Boolean status) {
        this.departId = departId;
        this.departName = departName;
        this.description = description;
        this.phone = phone;
        this.status = status;
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public void inputData(Scanner scanner, Department[] arrDepartments, int index){
        if(index < 0){
            departId = 1 ;
        }else {
            departId = arrDepartments[index].getDepartId() + 1 ;
        }

        while (true){
            System.out.println("Enter department name : ");
            departName = scanner.nextLine().trim();
            if(departName.matches("^[DP]\\w{5}$")){
                break;
            }else {
                System.err.println("Department name Minimum 6 characters - Starts with the letter D or P - No duplicates !");
            }
        }

        while (true){
            System.out.println("Enter description : ");
            description = scanner.nextLine().trim();
            if(description.length() >= 5 ){
                break;
            }else {
                System.err.println("Length description >= 5 !");
            }
        }

        while (true){
            System.out.println("Enter phone number department : ");
            phone = scanner.nextLine().trim();
            if(phone.matches("^02[0-9][0-9][0-9]{6}$")){
                break;
            }else {
                System.err.println("Phone number invalid !");
            }
        }

        while (true){
            try {
                System.out.println("Enter status department (true or false): ");
                status = Boolean.parseBoolean(scanner.nextLine().trim());
                break;
            }catch (Exception e){
                System.out.println("Status invalid !");
            }
        }
    }

    public void displayData(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10d | %-50s | %-50s | %-15s | %-15s |\n",departId,departName,description,phone,status);
    }
}
