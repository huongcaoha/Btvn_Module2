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
                    System.out.println("Enter number student want add :");
                    break;
                }
                case 3 : {
                    break;
                }
                case 4 : {
                    break;
                }
                case 5 : {
                    break;
                }
                case 6 : {
                    break;
                }
                case 7 : {
                    break;
                }
                default:{

                }
            }
        }
    }
}
