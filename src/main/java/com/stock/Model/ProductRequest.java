package com.stock.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="product")
public class ProductRequest implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long productId;
    private Long senderId;
    private Long receiverId;
    private String productName;

    /*@Temporal(TemporalType.TIMESTAMP)*/
    private Date date;
    private String productCode;
    private int Quantity;

    public ProductRequest() {
    }


    public ProductRequest(Long productId, Long senderId, Long receiverId, String productName, Date date, String productCode, int quantity) {
        this.productId = productId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.productName = productName;
        this.date = date;
        this.productCode = productCode;
        Quantity = quantity;
    }




    public Long getProductId() {
        return productId;
    }


    public void setProductId(Long productId) {
        this.productId = productId;
    }


    public Long getSenderId() {
        return senderId;
    }


    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }


    public Long getReceiverId() {
        return receiverId;
    }


    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }


    public String getProductName() {
        return productName;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public String getProductCode() {
        return productCode;
    }


    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    public int getQuantity() {
        return Quantity;
    }


    public void setQuantity(int quantity) {
        Quantity = quantity;
    }


    @Override
    public String toString() {
        return "ProductRequest{" +
                "productId=" + productId +
                ", senderId=" + senderId +
                ", receiverId=" + receiverId +
                ", productName='" + productName + '\'' +
                ", date=" + date +
                ", productCode='" + productCode + '\'' +
                ", Quantity=" + Quantity +
                '}';
    }
}
