package com.feilis.cloud.bean;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/6 21:26
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer productId;
    private String productName;
    private Double productPrice;
    private Integer productStock;

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

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }


}
