package com.feilis.cloud.bean;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/8 1:03
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long oId;

    private Integer uId;
    private String uName;

    private Integer pId;
    private String pName;
    private Double pPrice;

    private Integer pStock;

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

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
