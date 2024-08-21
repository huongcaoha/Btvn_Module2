package entity;

import java.util.Date;

public class ProductCart extends Product{
    private Integer quantity ;
    private Double totalMoney;

    public ProductCart() {
    }

    public ProductCart(String productName, Double rootPrice, Integer discount, Integer inventory, Integer cateId, Integer quantity, Double totalMoney) {
        super(productName, rootPrice, discount, inventory, cateId);
        this.quantity = quantity;
        this.totalMoney = totalMoney;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
