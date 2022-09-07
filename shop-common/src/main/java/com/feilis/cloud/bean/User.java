package com.feilis.cloud.bean;

/**
 * @Description: 用户实体类
 * @Author feilis
 * @Date 2022/9/8 1:08
 */
public class User {
    private static final long serialVersionUID = 1L;

    private Integer uId;
    private String uName;
    private String uPassword;
    private String uTelphone;

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

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuTelphone() {
        return uTelphone;
    }

    public void setuTelphone(String uTelphone) {
        this.uTelphone = uTelphone;
    }


}
