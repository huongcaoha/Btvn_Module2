package entity;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private Integer customerId ;
    private String customerName ;
    private String password ;
    private String repassword ;
    private Boolean gender ;
    private Date birthday ;
    private String phoneNumber ;
    private String email ;
    private Boolean status = true ;
    private Date createdDate ;

    public Customer() {
    }

    public Customer(Integer customerId, String customerName, String password, String repassword, Boolean gender, Date birthday, String phoneNumber, String email, Date createdDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
        this.repassword = repassword;
        this.gender = gender;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.createdDate = createdDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setFullname(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
