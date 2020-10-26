package com.fa.entity;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer uId;

    /**
     * 用户名
     */
    private String uUsername;

    /**
     * 用户密码
     */
    private String uPassword;

    /**
     * 1表示不删除，0表示删除
     */
    private Integer isDelete;

    private static final long serialVersionUID = 1L;

    public User() {
    }

    public User(String uUsername, String uPassword) {
        this.uUsername = uUsername;
        this.uPassword = uPassword;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uUsername='" + uUsername + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}

