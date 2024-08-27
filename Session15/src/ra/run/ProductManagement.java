package ra.run;

import ra.common.IMethod;
import ra.entity.Product;
import ra.service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        String fileName= "listProduct.txt";
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("***********************************Product Menu ********************************");
            System.out.println("*                                                 1. Add product                                                                                 *");
            System.out.println("*                                                 2. Display list products                                                                  *");
            System.out.println("*                                                 3. Sort products by price                                                              *");
            System.out.println("*                                                 4. Update product                                                                           *");
            System.out.println("*                                                 5. Delete product                                                                            *");
            System.out.println("*                                                 6. Search product by name                                                         *");
            System.out.println("*                                                 7. Search for products in price range a – b                            *");
            System.out.println("*                                                 8. Exit                                                                                                  *");
            System.out.println("**********************************************************************************");
            int choice = 0 ;
            choice = IMethod.getNumber(scanner,choice,"Enter choice : ");
            switch (choice){
                case 1 : {
                    ProductService.addProduct();
                    break;
                }
                case 2 : {
                    List<Product> products = IMethod.getListObject(fileName) ;
                    ProductService.displayListProduct(products);
                    break;
                }
                case 3 : {
                    ProductService.sortProductByPrice();
                    break;
                }
                case 4 : {
                    ProductService.updateProduct();
                    break;
                }
                case 5 : {
                    ProductService.deleteProduct();
                    break;
                }
                case 6 : {
                    ProductService.searchProductByName();
                    break;
                }
                case 7 : {
                    ProductService.searchProductByPriceRange();
                    break;
                }
                case 8 : {
                    return;
                }
                default: {
                    System.err.println("Enter choice from 1 to 8 !");
                }
            }
        }
    }
}
