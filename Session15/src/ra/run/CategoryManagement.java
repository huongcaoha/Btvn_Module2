package ra.run;

import ra.common.IMethod;
import ra.entity.Categories;
import ra.service.CategoriesService;

import java.util.List;
import java.util.Scanner;

public class CategoryManagement {
    public static void main(String[] args) {
        String fileName = "listCategories.txt";
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("***************************************  CATEGORIES MENU *************************************");
            System.out.println("*                                                                                                                                                                            *");
            System.out.println("*                                                        1. Add categories                                                                                  *");
            System.out.println("*                                                        2. Display categories                                                                            *");
            System.out.println("*                                                        3. Update categories                                                                            *");
            System.out.println("*                                                        4. Delete categories                                                                              *");
            System.out.println("*                                                         5. Update status categories                                                               *");
            System.out.println("*                                                        6. Exit                                                                                                        *");
            System.out.println("*                                                                                                                                                                            *");
            System.out.println("****************************************************************************************************");
            int choice = 0 ;
           choice = IMethod.getNumber(scanner,choice,"Enter choice : ");
            switch (choice){
                case 1 : {
                    CategoriesService.addCategories();
                    break;
                }
                case 2 : {
                    List<Categories> categories = IMethod.getListObject(fileName);
                    CategoriesService.displayListCategories(categories);
                    break;
                }
                case 3 : {
                    CategoriesService.updateCategories();
                    break;
                }
                case 4 : {
                    CategoriesService.deleteCategories();
                    break;
                }
                case 5 : {
                    CategoriesService.updateCategoriesStatus();
                    break;
                }
                case 6 : {
                    return;
                }
                default: {
                    System.err.println("Enter choice from 1 to 6 !");
                }
            }
        }
    }
}
