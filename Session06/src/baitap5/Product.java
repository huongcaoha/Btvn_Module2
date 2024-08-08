package baitap5;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Product {
    private String productId ;
    private String productName ;
    private float price ;
    private String description ;
    private String created ;
    private String catalogName ;
    private int productStatus ;

    public Product() {
    }

    public Product(String productId, String productName, float price, String description, String created, String catalogName, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.catalogName = catalogName;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Nhập productId gồm 4 ký tự bắt đầu là một trong 3 ký tự (C: các đồ uống là café, S: các đồ uống là sinh tố, A: các đồ ăn nhanh) :");
                productId = scanner.nextLine();
                if(productId.matches("^[CSA][a-zA-Z0-9]{3}$")){
                    break;
                }
            }catch (Exception e ){
                System.out.println("Nhập 4 ký tự bắt đầu là một trong 3 ký tự (C: các đồ uống là café, S: các đồ uống là sinh tố, A: các đồ ăn nhanh)");
            }
        }

        while (true){
            try {
                System.out.println("Nhập product name (có từ 10-50 ký tự) :");
                productName = scanner.nextLine().trim();
                if(productName.length() >= 10 && productName.length() <= 50){
                    break;
                }
            }catch (Exception e){
                System.out.println("Nhập tên từ 10 - 50 kí tự");
            }
        }

        while (true){
            try {
                System.out.println("Nhập giá sản phẩm :(price > 0) :");
                price = Float.parseFloat(scanner.nextLine());
                if(price > 0){
                    break;
                }
            }catch (Exception e){
                System.out.println("NHập lại giá > 0 !");
            }
        }

        System.out.println("Nhập mô tả sản phẩm :");
        description = scanner.nextLine();

        while (true){
            System.out.println("Nhập ngày nhập sản phẩm có định dạng dd/mm/yyyy. : ");
            created = scanner.nextLine();
            if(created.matches("^[0-3][0-9]/[01][0-9]/[2][0][2][0-9]")){
                break;
            }
        }

        System.out.println("Nhập tên danh mục sản phẩm :");
        catalogName = scanner.nextLine();

        while (true){
            try {
                System.out.println("Nhập trạng thái sản phẩm  (0: Đang bán – 1: Hết hàng – 2: Không bán) :");
                productStatus = Integer.parseInt(scanner.nextLine());
                if(productStatus >= 0 && productStatus < 3){
                    break;
                }
            }catch (Exception e){
                System.out.println("trạng thái sản phẩm  (0: Đang bán – 1: Hết hàng – 2: Không bán) !");
            }
        }

    }

    public void displayData(){
        String status = "";
        if(productStatus == 0){
            status = "Đang bán";
        } else if (productStatus == 1) {
            status = "Hết hàng";
        }else {
            status = "Không bán";
        }
        System.out.println("_________________________________________________________________________________________________________________________");
        System.out.printf("|%-6s|%-20s|%-10.2f|%-30s|%-12s|%-20s|%-15s|",productId,productName,price,description,created,catalogName,status);

    }
}
