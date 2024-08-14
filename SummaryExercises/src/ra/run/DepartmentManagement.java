package ra.run;

import ra.Common.Common;
import ra.Common.Data;
import ra.controller.Controller;
import ra.depart.Department;

import java.util.Scanner;

public class DepartmentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (true){
           System.out.println("**************************************************DEPARTMENT MENU**************************************************");
           System.out.println("|                                                                                                                                                                                                                      |");
           System.out.println("|                                                                            1. Nhập thông tin các phòng ban                                                                             |");
           System.out.println("|                                                                            2. Hiển thị thông tin các phòng ban                                                                         |");
           System.out.println("|                                                                            3. Cập nhật thông tin phòng ban                                                                              |");
           System.out.println("|                                                                            4. Xóa phòng ban                                                                                                         |");
           System.out.println("|                                                                            5. Cập nhật trạng thái phòng ban                                                                             |");
           System.out.println("|                                                                            6. Thoát                                                                                                                           |");
           System.out.println("|                                                                                                                                                                                                                      |");
           System.out.println("****************************************************************************************************************************");
           int choice = 0 ;
           choice = Common.getInputInt(choice,"Enter choice : ");
           switch (choice){
               case 1 : {
                 Controller.addDepartments();
                   break;
               }
               case 2 : {
                   Controller.displayDepartments(Data.departments);
                   break;
               }
               case 3 : {
                   Controller.updateDepartment();
                   break;
               }
               case 4 : {
                   Controller.deleteDepartment();
                   break;
               }
               case 5 : {
                   Controller.updateStatusDepartment();
                   break;
               }
               case 6 : {
                   return;
               }
               default: {
                   System.err.println("Choice invalid !");
               }

           }
       }

    }
}
