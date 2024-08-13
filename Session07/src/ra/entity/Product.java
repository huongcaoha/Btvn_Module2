package ra.entity;

import ra.common.DisplayList;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Product {
    private String productId ;
    private  String productName ;
    private Float price ;
    private String description ;
    private Date created ;
    private  int catalogId ;
    private int productStatus ;

    public Product() {
    }

    public Product(String productId, String productName, Float price, String description, Date created, int catalogId, int productStatus) {
        productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(Scanner scanner , Product[] products , int intdex , Categories[] categories){
        SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");
        while (true){
            System.out.println("Enter productId ( 4 characters starting with one of 3 letters (C, S, A), no duplicates) : ");
            productId = scanner.nextLine().trim();
            if(productId.matches("^[CSA]\\w{3}$")){
                break;
            }else {
                System.err.println("4 characters starting with one of 3 letters (C, S, A), no duplicates");
            }
        }

        while (true){
            System.out.println("Enter product name ( 10 >= length <= 50)");
            productName = scanner.nextLine().trim().replaceAll("\\s+"," ");
            if(productName.length() >= 10 && productName.length() <= 50){
                break;
            }else {
                System.err.println("Product name invalid (10 >= length <= 50) !");
            }
        }

        while (true){
            try {
                System.out.println("Enter price :");
                price = Float.parseFloat(scanner.nextLine().trim());
                if(price > 0){
                    break;
                }else {
                    System.err.println("Price > 0 !");
                }
            }catch (Exception e){
                System.err.println("Please enter price valid !");
            }
        }

        System.out.println("Enter description : ");
        description = scanner.nextLine().trim().replaceAll("\\s+", " ") ;

        while (true){
            System.out.println("Enter created date (dd/mm/yyyy) ;");
            String datetime = scanner.nextLine();
            try {
                created = date.parse(datetime);
                break;
            }catch (Exception e){
                System.err.println("Created date  invalid !");
            }
        }

       while (true){
           DisplayList.displayListCategory(categories);
           try {
               System.out.println("Enter catalogId : ");
               catalogId = Integer.parseInt(scanner.nextLine());
           }catch (Exception e){
               System.err.println("CatalogId invalid !");
           }
           boolean checkId = false;
           for(Categories cate : categories){
                if(cate != null){
                   if( cate.getCatalogId() == catalogId){
                       checkId = true ;
                       break;
                   }
                }else {
                    break;
                }
           }
           if(checkId){
               System.err.println("CatalogId exis !");
           }else {
               break;
           }
       }

       while (true){
           try {
               System.out.println("Enter product status (0: Đang bán – 1: Hết hàng – 2: Không bán)");
               productStatus = Integer.parseInt(scanner.nextLine().trim());
               if(productStatus >= 0 && productStatus < 3){
                   break;
               }else {
                   System.out.println("Product status invalid (0: Đang bán – 1: Hết hàng – 2: Không bán)");
               }
           }catch (Exception e){
               System.err.println();
           }
       }

    }
}
