package ra.run;

import ra.Common.Common;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("**************************************************EMPLOYEE DEPARTMENT MENU**************************************************");
            System.out.println("|                                                                                                                                                                                                                                            |");
            System.out.println("|                                                                                                       1. Quản lý phòng ban                                                                                              |");
            System.out.println("|                                                                                                       2. Quản lý nhân viên                                                                                                 |");
            System.out.println("|                                                                                                       3. Thoát                                                                                                                      |");
            System.out.println("|                                                                                                                                                                                                                                            |");
            System.out.println("*****************************************************************************************************************************************");
            int choice = 0 ;
          choice =  Common.getInputInt(choice,"Enter choice : ");
            switch (choice){
                case 1 : {
                    DepartmentManagement.main(args);
                    break;
                }
                case 2 : {
                    EmployeeManagement.main(args);
                    break;
                }
                case 3 : {
                    System.out.println("Goodbye !!!");
                    return;
                }
                default: {
                    System.out.println("Enter try again !");
                }
            }
        }
    }
}