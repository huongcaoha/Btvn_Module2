package bai8;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Product implements Serializable {
    private Integer id ;
    private String productName ;
    private  String brand ;
    private Double price ;
    private String description ;

    public Product() {
    }

    public Product(Integer id, String productName, String brand, Double price, String description) {
        this.id = id;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public void inputData(Scanner scanner){
        String fileName = "src/bai8/listProduct.txt";
        List<Product> products = Main.getData(fileName);
        if(products.isEmpty()){
            this.id = 1 ;
        }else {
            this.id = products.stream().map(Product::getId).max(Integer::compare).orElse(1);
        }

        while (true){
            System.out.println("Enter product name : ");
            this.productName = scanner.nextLine().trim();
            if(products.stream().anyMatch(product -> product.getProductName().equalsIgnoreCase(productName))){
                System.err.println("Product name exist !");
            }else {
                break;
            }
        }

        while (true){
            System.out.println("Enter brand : ");
            this.brand = scanner.nextLine().trim();
            if(brand.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }

        while (true){
            try {
                System.out.println("Enter price : ");
                this.price = Double.parseDouble(scanner.nextLine().trim());
                if(price > 0){
                    break;
                }else {
                    System.err.println("Enter price > 0 !");
                }
            }catch (Exception e){
                System.err.println("Price invalid !");
            }
        }

        while (true){
            System.out.println("Enter description :");
            this.description = scanner.nextLine().trim();
            if(description.isEmpty()){
                System.err.println("Cannot be left blank !");
            }else {
                break;
            }
        }
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
