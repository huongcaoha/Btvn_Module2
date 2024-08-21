package entity;

import common.IMethod;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Product {
    Scanner scanner = new Scanner(System.in);
    private Integer productId ;
    private String productName ;
    private Double rootPrice ;
    private Integer discount ;
    private  Double finalPrice ;
    private Integer inventory ;
    private Integer cateId ;
    private Integer status ;
    private Date createdDate ;

    public Product() {
    }

    public Product( String productName, Double rootPrice, Integer discount,  Integer inventory, Integer cateId) {
        this.productId = IMethod.getIdProduct();
        this.productName = productName;
        this.rootPrice = rootPrice;
        this.discount = discount;
        this.finalPrice = rootPrice - ((rootPrice * discount) / 100);
        this.inventory = inventory;
        this.cateId = cateId;
        this.status = 1;
       this.createdDate = new Date();
    }

    public Integer getProductId() {
        return productId;
    }

    public void inputData(){
        this.productId = IMethod.getIdProduct();

        while (true){
            System.out.println("Enter product name : ");
            this.productName = scanner.nextLine().trim();
            if(productName.length() == 0){
                System.err.println("Product name cannot be left blank !");
            }else {
                break;
            }
        }

        while (true){
            try {
                System.out.println("Enter selling price : ");
                this.rootPrice = Double.parseDouble(scanner.nextLine().trim());
                if(rootPrice > 0){
                    break;
                }else {
                    System.err.println("Selling price > 0 !");
                }
            }catch (Exception e){
                System.err.println("Selling price invalid !");
            }
        }

        while (true){
            try {
                System.out.println("Enter discount product (0% - 100%) : ");
                this.discount = Integer.parseInt(scanner.nextLine().trim());
                if(discount >= 0 && discount <= 100){
                    break;
                }else {
                    System.err.println("Enter discount from 0 to 100 ! ");
                }
            }catch (Exception e){
                System.err.println("Discount invalid !");
            }
        }

        this.finalPrice = rootPrice - ((rootPrice * discount) / 100);

        while (true){
            try {
                System.out.println("Enter inventory : ");
                this.inventory = Integer.parseInt(scanner.nextLine().trim());
                if(inventory > 0){
                    break;
                }else {
                    System.err.println("Inventory > 0 !");
                }
            }catch (Exception e){
                System.out.println("Inventory invalid !");
            }
        }

        IMethod.displayListCategory();
        while (true){
            try {
                System.out.println("Enter id category : ");
                this.cateId = Integer.parseInt(scanner.nextLine().trim());
                if(IMethod.checkExisCategory(cateId)){
                    break;
                }else {
                    System.out.println("Cate id not match !");
                }
            }catch (Exception e){
                System.out.println("Cate id invalid !");
            }
        }

        this.status = 1;
        this.createdDate = new Date();
    }
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getRootPrice() {
        return rootPrice;
    }

    public void setRootPrice(Double rootPrice) {
        this.rootPrice = rootPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
