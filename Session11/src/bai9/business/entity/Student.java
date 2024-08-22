package bai9.business.entity;

import java.util.Scanner;

public class Student {
    private static Integer current = 1 ;
    private Integer studentId ;
    private String name ;
    private Double avgScore ;

    public Student() {
        studentId = current;
        current++;
    }

    public Student(String name, Double avgScore) {
        this.name = name;
        this.avgScore = avgScore;
    }

    public void input(Scanner scanner){
        while (true){
            System.out.println("Enter name :");
            this.name = scanner.nextLine().trim();
            if(name.length() == 0){
                System.out.println("Do not blank !");
            }else {
                break;
            }
        }

        while (true){
            try {
                System.out.println("Enter avg score :");
                this.avgScore = Double.parseDouble(scanner.nextLine().trim());
                if(avgScore > 0){
                    break;
                }else {
                    System.err.println("Enter avg score > 0 !");
                }
            }catch (Exception e){
                System.out.println("Avg score invalid !");
            }
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Double avgScore) {
        this.avgScore = avgScore;
    }

    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }
}
