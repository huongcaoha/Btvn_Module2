package baitap;

import Common.Student1;

import java.util.Scanner;

public class Baitap9 {
    public static void showListStudent(Student1[] arr){
        boolean isExits = false;
        for(Student1 student1 : arr){
            if(student1 != null){
                isExits = true ;
                break;
            }
        }
       if(!isExits){
           System.out.println("Danh sách trống !");
       }else {
           System.out.println("Danh sách học sinh :");
           for(Student1 student : arr){
               if(student != null){
                   student.displayData();
               }else {
                   break;
               }
           }
           System.out.println("---------------------------------------------------------------------------------");
       }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student1[] students = new Student1[100];
        int choise = 0 ;
        while (true){
            System.out.println("Chương trình quản lý học sinh !");
            System.out.println("1 : Hiển thị danh sách tất cả học sinh");
            System.out.println("2 : Thêm mới học sinh ");
            System.out.println("3 : Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4 : Xóa học sinh ");
            System.out.println("5 : Thoát");
            while (true){
                try {
                    System.out.println("Xin mời lưa chọn chức năng :");
                    choise = Integer.parseInt(scanner.nextLine());
                    if(choise > 0 && choise < 6){
                        break;
                    }
                }catch (Exception e){
                    System.out.println("Mời nhập lại từ 1 - 5");
                }
            }
            switch (choise){
                case 1 : {
                    if(students.length == 0){
                        System.out.println("Danh sách trống !");
                    }else {
                       showListStudent(students);
                    }
                    System.out.println("__________________*____________*____________*_________________");
                    break;
                }
                case 2 : {
                    int index = -1 ;
                    for(Student1 student : students){
                        if(student == null){
                            break;
                        }else {
                            index++ ;
                        }
                    }
                    Student1 student = new Student1();
                    student.inputData();
                    boolean ischeckId = false ;
                    for(Student1 student1 : students){
                       if(student1 != null){
                           if(student1.getStudentId().trim().toLowerCase().equals(student.getStudentId().trim().toLowerCase()) ){
                               ischeckId = true ;
                           }
                       }
                    }
                    if(ischeckId){
                        System.out.println("mã học sinh đã tồn tại !");
                    }else {
                        students[index+1] = student;
                        System.out.println("Thêm thành công ho sinh mới");
                        showListStudent(students);

                    }
                    System.out.println("__________________*____________*____________*_________________");
                    break;
                }
                case 3 : {
                    System.out.println("Nhập mã học sinh để sửa đổi");
                    String idStudent = scanner.nextLine().trim().toLowerCase();
                    boolean isCheck = false ;
                    int index = -1 ;
                    for(Student1 student : students){
                        index++;
                       if(student != null){
                           if(student.getStudentId().trim().toLowerCase().equals(idStudent)){
                               isCheck = true ;
                               break;
                           }
                       }
                    }
                    if(isCheck){
                        students[index].updateData();
                        System.out.println("Update thành công !");
                    }else {
                        System.out.println("Không tìm thâý sinh viên với mã id như vậy !");
                    }

                    showListStudent(students);
                    System.out.println("__________________*____________*____________*_________________");
                    break;

                }
                case 4 : {
                    System.out.println("Nhập mã học sinh để xóa");
                    String idStudent = scanner.nextLine().trim().toLowerCase();
                    boolean isCheck = false ;
                    int index = -1 ;
                    for(Student1 student : students){
                        index++;
                       if(student != null){
                           if(student.getStudentId().trim().toLowerCase().equals(idStudent)){
                               isCheck = true ;
                               break;
                           }
                       }
                    }
                    if(isCheck){
                        students[index] = null;
                        System.out.println("Xóa thành công !");
                    }else {
                        System.out.println("Không tìm thâý sinh viên với mã id như vậy !");
                    }

                    showListStudent(students);
                    System.out.println("__________________*____________*____________*_________________");
                    break;
                }
                case 5 : {
                    System.out.println("Good bye !");
                    return;
                }
            }
        }
    }
}
