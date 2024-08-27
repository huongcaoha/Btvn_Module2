package ra.entity;

import ra.common.IMethod;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Product implements Serializable {
    String fileNameProduct = "listProduct.txt";
    String fileNameCategory = "listCategories.txt";

    private String productId ;
    private String productName ;
    private Float price ;
    private String description ;
    private Date createdDate ;
    private Integer catalogId ;
    private Integer productStatus ;

    public Product() {
    }

    public Product( String productId, String productName, Float price, String description, Date createdDate, Integer catalogId, Integer productStatus) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.createdDate = createdDate;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(Scanner scanner){
        List<Product> products = IMethod.getListObject(fileNameProduct);
        List<Categories> categories = IMethod.getListObject(fileNameCategory);

        inputProductId(scanner, products);

        inputProductName(scanner, products);

        inputPrice(scanner);

        inputDescription(scanner);

        inputCatalogId(scanner, categories);

        inputProductStatus(scanner);

    }

    public void updateData(Scanner scanner){
        List<Product> products = IMethod.getListObject(fileNameProduct);
        List<Categories> categories = IMethod.getListObject(fileNameCategory);

        updateProductName(scanner, products);

        inputPrice(scanner);

        inputDescription(scanner);

        inputCatalogId(scanner, categories);

        inputProductStatus(scanner);
    }

    public void displayData(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("[ %-10s | %-30s | %-15.1f | %-30s | %-10d | %-20s ]\n",productId,productName,price,description,catalogId,productStatus == 0 ? "on sale" : (productStatus == 1 ? "out of stock" : "off sale"));
    }

    private void inputProductStatus(Scanner scanner) {
        while (true){
            try {
                System.out.println("Enter product status (0 : on sale ; 1 : out of stock ; 2 : off sale) :");
                this.productStatus = Integer.parseInt(scanner.nextLine().trim());
                if(productStatus >= 0 && productStatus < 3){
                    break;
                }else {
                    System.err.println("Enter product status = 0 or 1 or 2 !");
                }
            }catch (Exception e){
                System.err.println("Product status invalid !");
            }
        }
    }

    private void inputCatalogId(Scanner scanner, List<Categories> categories) {
        while (true){
            System.out.println("********************************* List Category *********************************");
            for(Categories cate : categories){
                cate.displayData();
            }
            try {
                System.out.println("Enter catalog id :");
                this.catalogId = Integer.parseInt(scanner.nextLine().trim());
                boolean isExist = categories.stream().anyMatch(cate -> Objects.equals(cate.getCatalogId(), this.catalogId));
                if(isExist){
                    break;
                }else {
                    System.err.println("Not found catalog id !");
                }
            }catch (Exception e){
                System.err.println("Catalog id invalid !");
            }

        }
    }

    private void inputDescription(Scanner scanner) {
        while (true){
            System.out.println("Enter description : ");
            this.description = scanner.nextLine().trim();
            if(description.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
    }

    private void inputPrice(Scanner scanner) {
        while (true){
            try {
                System.out.println("Enter price (price > 0) :");
                this.price = Float.parseFloat(scanner.nextLine().trim());
                if(price > 0){
                    break;
                }else {
                    System.err.println("Enter price > 0 !");
                }
            }catch (Exception e){
                System.err.println("Price invalid !");
            }
        }
    }

    private void inputProductName(Scanner scanner, List<Product> products) {
        while (true){
            System.out.println("Enter product name (must be from 10-50 characters, no duplicates) :");
            this.productName = scanner.nextLine().trim();
            if(productName.length() >= 10 && productName.length() <= 50){
                boolean isExist = products.stream().anyMatch(el -> el.getProductName().equalsIgnoreCase(productName));
                if(isExist){
                    System.err.println("Product name existed !");
                }else {
                    break;
                }
            }else {
                System.err.println("Product name must be from 10-50 characters !");
            }
        }
    }

    private void updateProductName(Scanner scanner, List<Product> products) {
        String oddProductName = this.productName ;
        while (true){
            System.out.println("Enter product name (must be from 10-50 characters, no duplicates) :");
            this.productName = scanner.nextLine().trim();
            if(productName.length() >= 10 && productName.length() <= 50){
                boolean isExist = products.stream().anyMatch(el -> el.getProductName().equalsIgnoreCase(productName) && !el.getProductName().equalsIgnoreCase(oddProductName));
                if(isExist){
                    System.err.println("Product name existed !");
                }else {
                    break;
                }
            }else {
                System.err.println("Product name must be from 10-50 characters !");
            }
        }
    }

    private void inputProductId(Scanner scanner, List<Product> products) {
        while (true){
            System.out.println("Enter product id (includes 4 characters starting with one of 3 characters (C, S, A), cannot be duplicated) :");
            this.productId = scanner.nextLine().trim();
            if(!productId.isEmpty() && productId.matches("^[CSA]\\w{3}$")){
                boolean isExist = products.stream().anyMatch(el -> el.getProductId().equalsIgnoreCase(productId));
                if(isExist){
                    System.err.println("Product id existed !");
                }else {
                    break;
                }
            }else {
                System.err.println("Product id not empty & includes 4 characters starting with one of 3 characters (C, S, A), cannot be duplicated !");
            }
        }
    }
}
