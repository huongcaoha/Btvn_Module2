package ra.run;

import ra.Common.Common;
import ra.Common.Data;
import ra.controller.Controller;

public class EmployeeManagement {
    public static void main(String[] args) {
       while (true){
           System.out.println("**************************************************EMPLOYEE MANAGEMENT**************************************************");
           System.out.println("|                                                                                                                                                                                                                                 |");
           System.out.println("|                                                                 1. Nhập thông tin các nhân viên                                                                                                      |");
           System.out.println("|                                                                 2.Hiển thị thông tin các nhân viên                                                                                                   |");
           System.out.println("|                                                                 3. Sắp xếp các nhân viên theo lương giảm dần                                                                           |");
           System.out.println("|                                                                 4. Cập nhật thông tin nhân viên theo mã nhân viên                                                                    |");
           System.out.println("|                                                                 5. Xóa nhân viên theo mã nhân viên                                                                                               |");
           System.out.println("|                                                                 6. Tìm kiếm các nhân viên theo tên phòng ban                                                                           |");
           System.out.println("|                                                                 7. Tìm kiếm nhân viên trong khoảng lương a – b                                                                       |");
           System.out.println("|                                                                 8. Thoát                                                                                                                                                 |");
           System.out.println("|                                                                                                                                                                                                                                 |");
           System.out.println("**********************************************************************************************************************************");
           int choice = 0 ;
           choice = Common.getInputInt(choice,"Enter choice : ");
           switch (choice){
               case 1 : {
                   Controller.addEmployees();
                   break;
               }
               case 2 : {
                  Controller.displayAllEmployees(Data.employees);
                   break;
               }
               case 3 : {
                   Controller.sortEmployeeDecrease();
                   break;
               }
               case 4 : {
                    Controller.updateEmployee();
                   break;
               }
               case 5 : {
                   Controller.deleteEmployee();
                   break;
               }
               case 6 : {
                   Controller.searchEmployeeByDepartmentName();
                   break;
               }
               case 7 : {
                    Controller.searchEmployeeBySalary();
                   break;
               }
               case 8 : {
                   return;
               }
               default: {
                   System.err.println("Enter try again !!!");
               }
           }
       }
    }
}
