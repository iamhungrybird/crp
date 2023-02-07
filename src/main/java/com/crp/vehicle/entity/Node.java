package com.crp.vehicle.entity;

import java.util.Date;
import java.io.Serializable;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (Node)实体类
 *
 * @author wxx
 * @since 2023-01-28 15:25:32
 */
@ApiModel("")
@Data
public class Node implements Serializable {
    private static final long serialVersionUID = -89347411015737624L;
    /**
     * 审批节点ID
     */
    @ApiModelProperty("审批节点ID")
    private Integer nid;
    /**
     * 申请ID
     */
    @ApiModelProperty("申请ID")
    private Integer aid;
    /**
     * 当前节点名
     */
    @ApiModelProperty("当前节点名")
    private String nodename;
    /**
     * 处理人ID
     */
    @ApiModelProperty("处理人ID")
    private String userid;
    /**
     * 用户操作  作废  提交   驳回  等
     */
    @ApiModelProperty("用户操作  作废  提交   驳回  等")
    private String operation;
    /**
     * 操作时间
     */
    @ApiModelProperty("操作时间")
    private Date operatime;
    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createdtime;


    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Date getOperatime() {
        return operatime;
    }

    public void setOperatime(Date operatime) {
        this.operatime = operatime;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

}

