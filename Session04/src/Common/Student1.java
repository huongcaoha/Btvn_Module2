package Common;

import java.util.Scanner;

public class Student1 {
    private String studentId ;
    private String studentName ;
    private int age ;
    private int gender ;
    private String address ;
    private String phoneNumber ;

    public Student1() {
    }

    public Student1(String studentId, String studentName, int age, int gender, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id : ");
        studentId = scanner.nextLine();

        System.out.println("Enter student name : ");
        studentName = scanner.nextLine();

        while (true){
            try {
                System.out.println("Enter age student :");
                age = Integer.parseInt(scanner.nextLine());
                if(age >= 6){
                    break;
                }
            }catch (Exception e){
                System.out.println("Please enter age valid integer & age >= 6 ");
            }
        }

        while (true){
            try {
                System.out.println("Enter gender student (1 : male , 2 : female , 3 : other ) :");
                gender = Integer.parseInt(scanner.nextLine());
                if(gender > 0 && gender < 4){
                    break;
                }
            }catch (Exception e){}
            System.out.println("Enter gender valid 1 : male , 2 : female , 3 : other");
        }

        System.out.println("Enter address : ");
        address = scanner.nextLine();

        while (true){
           try {
               System.out.println("Enter phone number :");
               phoneNumber = scanner.nextLine();
               if(!phoneNumber.matches("^0[35789][0-9]{8}$")){
                   System.out.println("Phone number invalid !");
               }else {
                   break;
               }
           }catch (NullPointerException e){
               System.out.println("Phone number invalid !");
           }
        }

    }

    public void updateData(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name : ");
        studentName = scanner.nextLine();

        while (true){
            try {
                System.out.println("Enter age student :");
                age = Integer.parseInt(scanner.nextLine());
                if(age >= 6){
                    break;
                }
            }catch (Exception e){
                System.out.println("Please enter age valid integer & age >= 6 ");
            }
        }

        while (true){
            try {
                System.out.println("Enter gender student (1 : male , 2 : female , 3 : other ) :");
                gender = Integer.parseInt(scanner.nextLine());
                if(gender > 0 && gender < 4){
                    break;
                }
            }catch (Exception e){}
            System.out.println("Enter gender valid 1 : male , 2 : female , 3 : other");
        }

        System.out.println("Enter address : ");
        address = scanner.nextLine();

        while (true){
            try {
                System.out.println("Enter phone number :");
                phoneNumber = scanner.nextLine();
                if(!phoneNumber.matches("^0[35789][0-9]{8}$")){
                    System.out.println("Phone number invalid !");
                }else {
                    break;
                }
            }catch (NullPointerException e){
                System.out.println("Phone number invalid !");
            }
        }

    }


    public void displayData() {
        String sex= "";
        if(gender == 1){
            sex = "male";
        }else if (gender == 2){
            sex = "female" ;
        }else {
            sex = "other";
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("|%-6s|%-20s|%-6d|%-10s|%-20s|%-12s|\n",studentId,studentName,age,sex,address,phoneNumber);


    }
}
