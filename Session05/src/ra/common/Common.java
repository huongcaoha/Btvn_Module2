package ra.common;

import ra.entity.Category;
import ra.entity.Product;

import java.util.Scanner;

public class Common {
    public static void displayCategory(Category[] categories){
        if(categories.length == 0){
            System.out.println("Not found category !");
        }else {
            System.out.printf("| %-5s | %-50s | %-50s | %-10s |","categoryId","categoryName","depcription","categoryStatus");
            for (Category cate : categories){
                if(cate == null){
                    break;
                }else {
                    cate.displayData();
                }
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------");

        }
    }

    public static void displayProduct(Product[] products){
        if(products.length == 0){
            System.out.println("List product empty !");
        }else {
          for(Product pro : DataBase.products){
              if(pro != null){
                  System.out.printf("| %-6s | %-30s | %-10s | %-30s | %-12s | %-5s | %-10s |\n","productId","productName","price","description","created","categoryId","Status");
                  System.out.printf("| %-6s | %-30s | %-10s | %-30s | %-12s | %-5s | %-10s |\n",pro.getCategoryId(),pro.getProductName(),pro.getPrice(),pro.getDescription(),pro.getCreated(),pro.getCategoryId(),pro.getProductStatus());
              }else {
                  break;
              }
          }
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
        }
    }

    public static int getInputInt(int number){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Enter :");
                number = Integer.parseInt(scanner.nextLine());
                if(number > 0){
                    break;
                }else {
                    System.out.println("Enter number  > 0 !");
                }
            }catch (Exception e){
                System.out.println("Enter valid integer !");
            }
        }
        return  number ;
    }

    public static Float getInputFloat(Float number){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Enter :");
                number = Float.parseFloat(scanner.nextLine());
                if(number > 0){
                    break;
                }else {
                    System.out.println("Enter number  > 0 !");
                }
            }catch (Exception e){
                System.out.println("Enter valid number !");
            }
        }
        return  number ;
    }

//    public static void main(String[] args) {
//        int number = 0 ;
//        number = Common.getInputInt(number);
//        System.out.println(number);
//    }
}
