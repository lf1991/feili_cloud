package com.feilis.cloud.bean;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/6 21:26
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer pId;
    private String pName;
    private Double pPrice;
    private Integer pStock;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Double getpPrice() {
        return pPrice;
    }

    public void setpPrice(Double pPrice) {
        this.pPrice = pPrice;
    }

    public Integer getpStock() {
        return pStock;
    }

    public void setpStock(Integer pStock) {
        this.pStock = pStock;
    }


}
