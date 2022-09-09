package com.feilis.cloud.bean;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/8 1:03
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer orderId;
    private Integer userId;
    private String userName;
    private Integer productId;
    private String productName;
    private Double productPrice;
    private Integer orderStock;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getProductId() {
        return productId;
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

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getOrderStock() {
        return orderStock;
    }

    public void setOrderStock(Integer orderStock) {
        this.orderStock = orderStock;
    }


}
