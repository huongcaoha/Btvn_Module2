package baitap6;

import java.util.Scanner;

public class Product {
    private String productId ;
    private String productName ;
    private float importPrice ;
    private float exportPrice ;
    private float profit ;
    private int quantity ;
    private String description ;
    private Boolean status ;

    public Product() {
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, float profit, int quantity, String description, Boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = profit;
        this.quantity = quantity;
        this.description = description;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void inputData(Scanner scanner , Product[] products){
        while (true){
            System.out.println("Enter idProduct (The product code consists of 4 characters, starting with the letter P, and cannot be duplicated)  :");
            productId = scanner.nextLine();
            boolean isCheck = false ;
            for(Product proudct : products){
                if(proudct != null){
                    if(proudct.getProductId().equals(productId)){
                        isCheck = true ;
                        break;
                    }
                }else {
                    break;
                }
            }
            if(productId.matches("^P[a-zA-Z0-9]{3}$")){
                if(!isCheck){
                    break;
                }else {
                    System.out.println("Id product existed !");
                }
            }else {
                System.out.println("The product code consists of 4 characters, starting with the letter P, and cannot be duplicated");
            }
        }

        while (true){
            System.out.println("Enter product name (Product name has 6-50 characters, no duplicates) :  ");
            productName = scanner.nextLine();
            boolean isCheck = false ;
            for(Product proudct : products){
                if(proudct != null){
                    if(proudct.getProductName().equals(productName)){
                        isCheck = true ;
                        break;
                    }
                }else {
                    break;
                }
            }
            if(productName.length() >= 6 && productName.length() <= 50 ){
                if(!isCheck){
                    break;
                }else {
                    System.out.println(" Product name existed !");
                }
            }else {
                System.out.println("Product name has 6-50 characters, no duplicates");
            }
        }

        while (true){
           try {
               System.out.println("Enter inportPrice : (importPrice > 0) :");
               importPrice = Float.parseFloat(scanner.nextLine());
               if(importPrice > 0){
                   break;
               }
           }catch (Exception e){
               System.err.println("importPrice invalid !");
           }
        }

        while (true){
            try {
                System.out.println("Enter exportPrice (exportPrice > importPrice 20%) :");
                exportPrice = Float.parseFloat(scanner.nextLine());
                if(exportPrice - importPrice > (importPrice%100)*20){
                    break;
                }else {
                    System.out.println("exportPrice > importPrice 20% !");
                }
            }catch (Exception e){
                System.err.println("ExportPrice invalid !");
            }
        }

        profit = exportPrice - importPrice ;

        while (true){
            try {
                System.out.println("Enter quantity (quantity > 0) : ");
                quantity = Integer.parseInt(scanner.nextLine());
                if(quantity > 0 ){
                    break;
                }else {
                    System.out.println("Quantity > 0 !");
                }
            }catch (Exception e){
                System.err.println("Quantity invalid !");
            }
        }

        System.out.println("Enter description : ");
        description = scanner.nextLine();

        while (true){
            try {
                System.out.println("Enter status product (true  or false) : ");
                status = Boolean.parseBoolean(scanner.nextLine());
                break;
            }catch (Exception e){
                System.err.println("Status invalid !");
            }
        }

    }

    public void displayData(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-6s | %-30s | %-12.2f | %-12.2f | %-12.2f | %-5d | %-30s | %-10s |\n",productId,productName,importPrice,exportPrice,profit,quantity,description,status);
    }

    public void calProfit(){
        System.out.println("[ " +productName +  " : " + profit + " ]");
    }
}
