package com.feilis.cloud.bean;

/**
 * @Description: 用户实体类
 * @Author feilis
 * @Date 2022/9/8 1:08
 */
public class User {
    private static final long serialVersionUID = 1L;

    private Integer userId;
    private String userName;
    private String password;
    private String telphone;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
