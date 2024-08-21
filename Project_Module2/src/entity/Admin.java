package entity;

import java.util.Date;

public class Admin {
    private int adminId ;
    private String adminName ;
    private String password ;
    private  String email ;
    private String phoneNumber ;
    private Date createdDate ;

    public Admin() {
    }

    public Admin(int adminId, String adminName, String password, String email, String phoneNumber, Date createdDate) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.createdDate = createdDate;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
