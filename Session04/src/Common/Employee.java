package Common;

import java.util.Scanner;

public class Employee {
    private int employeeId ;
    private String employeeName ;
    private int age ;
    private int gender ;
    private float rate ;
    private double salary = rate * 1300000 ;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, int gender, float rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        this.salary = rate * 1300000 ;
    }

    public void InputData(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Enter employee id :");
                employeeId = Integer.parseInt(scanner.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Enter id valid type integer !");
            }
        }

        System.out.println("Enter employee name :");
        employeeName = scanner.nextLine();

        while (true){
            try {
                System.out.println("Enter employee age :");
                age = Integer.parseInt(scanner.nextLine());
                if(age > 0 && age < 150){
                    break;
                }
            }catch (Exception e){
                System.out.println("Enter valid type integer !");
            }
        }

        while (true){
            try {
                System.out.println("Enter employee gender (1: male , 2 : female ,3 : other) :");
                gender = Integer.parseInt(scanner.nextLine());
                if(gender > 0 && gender < 4){
                    break;
                }
            }catch (Exception e){
                System.out.println("Enter valid type integer (1: male , 2 : female ,3 : other)!");
            }
        }

        while (true){
            try {
                System.out.println("Enter rate salary (rate >= 1 ) :");
                rate = Float.parseFloat(scanner.nextLine());
                if(rate >= 1){
                    break;
                }
            }catch (Exception e){
                System.out.println("Enter rate valid type float (rate >= 1)!");
            }
        }

    }


    public void displayData() {
        System.out.println( "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", rate=" + rate +
                ", salary=" + salary +
                '}');;
    }
}
