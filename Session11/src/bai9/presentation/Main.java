package bai9.presentation;

import bai9.business.entity.Student;
import bai9.business.feature.StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        while (true){
            System.out.println("************************************* Student Management ***********************************");
            System.out.println("1. Show all student");
            System.out.println("2. Add student");
            System.out.println("3. Remove student by id");
            System.out.println("4. Find student by id");
            System.out.println("5. Get average score ");
            System.out.println("6. Sort by score ");
            System.out.println("7. Exit");

            int choice = 0 ;
            while (true){
                try {
                    System.out.println("Enter choice :");
                    choice = Integer.parseInt(scanner.nextLine().trim());
                    break;
                }catch (Exception e){
                    System.err.println("Choice invalid !");
                }
            }
            switch (choice){
                case 1 : {
                    studentManagement.showAll();
                    break;
                }
                case 2 : {
                    int number = 0 ;
                    while (true){
                        try {
                            System.out.println("Enter number student want add :");
                            number = Integer.parseInt(scanner.nextLine().trim());
                            if(number > 0){
                                break;
                            }else {
                                System.err.println("Enter number  > 0 !");
                            }
                        }catch (Exception e){
                            System.err.println("Number invalid !");
                        }
                    }
                    for(int i = 1 ; i <= number ; i++){
                        System.out.println("Enter student " + i );
                            Student student = new Student();
                            student.input(scanner);
                        studentManagement.addStudent(student);
                    }
                    System.out.println("Add successfully " + number + " student !");
                    studentManagement.showAll();
                    break;
                }
                case 3 : {
                    int id = 0 ;
                    while (true){
                        try {
                            System.out.println("Enter id student :");
                            id = Integer.parseInt(scanner.nextLine().trim());
                            if(id >= 0){
                                break;
                            }else {
                                System.out.println("Enter id >= 0 !");
                            }
                        }catch (Exception e){
                            System.out.println("Enter id is integer !");
                        }
                    }
                    studentManagement.removeStudent(id);
                    break;
                }
                case 4 : {
                    int id = 0 ;
                    while (true){
                        try {
                            System.out.println("Enter id student :");
                            id = Integer.parseInt(scanner.nextLine().trim());
                            if(id >= 0){
                                break;
                            }else {
                                System.out.println("Enter id >= 0 !");
                            }
                        }catch (Exception e){
                            System.out.println("Enter id is integer !");
                        }
                    }
                    studentManagement.findStudentById(id);
                    break;
                }
                case 5 : {
                    System.out.println("Avg score all student  : " + studentManagement.getAverageScoreAllStudent());
                    break;
                }
                case 6 : {
                    System.out.println("List student after sort by score : ");
                    studentManagement.sortByScore();
                    studentManagement.showAll();
                    break;
                }
                case 7 : {
                    System.out.println("Goodbye !!!");
                   return;
                }
                default:{
                    System.err.println("Enter choice form 1 to 7 !");
                }
            }
        }
    }
}
