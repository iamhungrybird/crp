package com.crp.vehicle.entity;

import java.io.Serializable;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (User)实体类
 *
 * @author wxx
 * @since 2023-01-28 15:25:33
 */
@ApiModel("")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 557260256910817154L;
    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")
    private String userid;
    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String username;
    /**
     * 用户ldap
     */
    @ApiModelProperty("用户ldap")
    private String ldap;
    /**
     * 用户手机号
     */
    @ApiModelProperty("用户手机号")
    private String phonenumber;
    /**
     * 用户类型  申请人   管理员   司机
     */
    @ApiModelProperty("用户类型  申请人   管理员   司机")
    private String usertype;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLdap() {
        return ldap;
    }

    public void setLdap(String ldap) {
        this.ldap = ldap;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

}

