package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Category {
    private Integer cateId ;
    private String cateName ;
    private Boolean status = true;
    private Date createdDate ;

    public Category() {
    }

    public Category(Integer cateId, String cateName) {
        this.cateId = cateId;
        this.cateName = cateName;
        this.createdDate = new Date();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void displayData(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("*******************************************************************************************************");
        System.out.printf("[ %-10d | %-50s | %-10s | %-20s ]\n" ,cateId , cateName , status ? "on" : "off",format.format(createdDate));
    }
}
