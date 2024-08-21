package entity;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer orderId ;
    private String customerName ;
    private String email ;
    private String phoneNumber ;
    private String address ;
    private List<ProductCart> carts ;
    private Double totalMoney ;
    private Integer status ;
    private Date createdDate ;

    public Order() {
    }

    public Order(Integer orderId, String customerName, String email, String phoneNumber, String address, List<ProductCart> carts, Double totalMoney, Integer status, Date createdDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.carts = carts;
        this.totalMoney = totalMoney;
        this.status = status;
        this.createdDate = createdDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ProductCart> getCarts() {
        return carts;
    }

    public void setCarts(List<ProductCart> carts) {
        this.carts = carts;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
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
