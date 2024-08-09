package baitap6;

import java.util.Scanner;

public class ProductManagement {
    public static  Product[] products = new Product[100];
    public static int currentIndexProduct = -1 ;

    public static void displayListProduct(Product[] arr){
        System.out.printf("| %-6s | %-30s | %-12s | %-12s | %-12s | %-5s | %-30s | %-10s |\n","ID","ProductName","Import","Export","Profit","Qty","Description","Status");
        for(Product product : arr){
            if(product != null){
                product.displayData();
            }else {
                break;
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("**********************************************MENU*******************************************");
            System.out.println("*                                  1. Nhập thông tin n sản phẩm (n nhập từ bàn phím)                                   *");
            System.out.println("*                                  2. Hiển thị thông tin các sản phẩm                                                                   *");
            System.out.println("*                                  3. Tính lợi nhuận các sản phẩm                                                                         *");
            System.out.println("*                                  4. Sắp xếp các  sản phẩm theo lợi nhuận giảm dần                                     *");
            System.out.println("*                                  5. Thống kê các sản phẩm theo giá                                                                 *");
            System.out.println("*                                  6. Thoát                                                                                                                   *");
            System.out.println("************************************************************************************************");
            int choise = 0 ;
            while (true){
                try {
                    System.out.println("Enter choise : ");
                    choise = Integer.parseInt(scanner.nextLine());
                        if(choise > 0 && choise < 7){
                            break;
                        }
                }catch (Exception e){
                    System.out.println("Choise invalid !");
                }
            }
            switch (choise){
                case 1 : {
                    int quantity = 0 ;
                    while (true){
                        try {
                            System.out.println("Enter quantity product want add :");
                            quantity = Integer.parseInt(scanner.nextLine());
                            if(quantity > 0){
                                break;
                            }
                        }catch (Exception e){
                            System.out.println("Quantity invalid !");
                        }
                    }
                    for(int i = 1 ; i <= quantity ; i++){
                        System.out.println("Enter product number : " + i);
                        ProductManagement.currentIndexProduct++ ;
                        Product product = new Product();
                        product.inputData(scanner,ProductManagement.products);
                        ProductManagement.products[currentIndexProduct] = product ;
                    }
                    ProductManagement.displayListProduct(ProductManagement.products);
                    break;
                }
                case 2 : {
                    ProductManagement.displayListProduct(ProductManagement.products);
                    break;
                }
                case 3 : {
                    System.out.println("Product profits : ");
                    for(Product product : ProductManagement.products){
                        if(product != null){
                            product.calProfit();
                        }else {
                            break;
                        }
                    }
                    break;
                }
                case 4 : {
                    for (int i = 0 ; i < ProductManagement.currentIndexProduct ;){
                        if(ProductManagement.products[i].getProfit() < ProductManagement.products[i+1].getProfit()){
                            Product tmp = ProductManagement.products[i] ;
                            ProductManagement.products[i] = ProductManagement.products[i+1] ;
                            ProductManagement.products[i+1] = tmp ;
                            if(i > 0){
                                i-- ;
                            }
                        }else {
                            i++ ;
                        }
                    }
                    ProductManagement.displayListProduct(ProductManagement.products);
                    break;
                }
                case 5 : {
                    for (int i = 0 ; i < ProductManagement.currentIndexProduct ;){
                        if(ProductManagement.products[i].getImportPrice() > ProductManagement.products[i+1].getImportPrice()){
                            Product tmp = ProductManagement.products[i] ;
                            ProductManagement.products[i] = ProductManagement.products[i+1] ;
                            ProductManagement.products[i+1] = tmp ;
                            if(i > 0){
                                i-- ;
                            }
                        }else {
                            i++ ;
                        }
                    }
                    ProductManagement.displayListProduct(ProductManagement.products);
                    break;
                }
                case 6 : {
                    break;
                }
                default: {

                }
            }
        }
    }
}
