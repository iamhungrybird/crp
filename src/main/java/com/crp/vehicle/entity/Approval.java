package com.crp.vehicle.entity;

import java.util.Date;
import java.io.Serializable;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (Approval)实体类
 *
 * @author wxx
 * @since 2023-01-28 15:25:30
 */
@ApiModel("")
@Data
public class Approval implements Serializable {
    private static final long serialVersionUID = 187191337756713320L;
    /**
     * 申请ID
     */
    @ApiModelProperty("申请ID")
    private Integer aid;
    /**
     * 申请人ID
     */
    @ApiModelProperty("申请人ID")
    private String userid;
    /**
     * 用车人
     */
    @ApiModelProperty("用车人")
    private String users;
    /**
     * 上车地点
     */
    @ApiModelProperty("上车地点")
    private String pickuplocation;
    /**
     * 目的地
     */
    @ApiModelProperty("目的地")
    private String destination;
    /**
     * 用车人数
     */
    @ApiModelProperty("用车人数")
    private Integer passengersnumber;
    /**
     * 用车时间
     */
    @ApiModelProperty("用车时间")
    private Date vehicletime;
    /**
     * 是否返程  0为是 1为否
     */
    @ApiModelProperty("是否返程  0为是 1为否   ")
    private Integer back;
    /**
     * 申请说明
     */
    @ApiModelProperty("申请说明")
    private String instructions;
    /**
     * 当前状态     活动中 已完成 已作废
     */
    @ApiModelProperty("当前状态     活动中 已完成 已作废")
    private String approvalstate;
    /**
     * 当前节点ID
     */
    @ApiModelProperty("当前节点ID")
    private Integer curnid;
    /**
     * 出车记录ID
     */
    @ApiModelProperty("出车记录ID")
    private Integer rid;
    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createdtime;


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getPickuplocation() {
        return pickuplocation;
    }

    public void setPickuplocation(String pickuplocation) {
        this.pickuplocation = pickuplocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getPassengersnumber() {
        return passengersnumber;
    }

    public void setPassengersnumber(Integer passengersnumber) {
        this.passengersnumber = passengersnumber;
    }

    public Date getVehicletime() {
        return vehicletime;
    }

    public void setVehicletime(Date vehicletime) {
        this.vehicletime = vehicletime;
    }

    public Integer getBack() {
        return back;
    }

    public void setBack(Integer back) {
        this.back = back;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getApprovalstate() {
        return approvalstate;
    }

    public void setApprovalstate(String approvalstate) {
        this.approvalstate = approvalstate;
    }

    public Integer getCurnid() {
        return curnid;
    }

    public void setCurnid(Integer curnid) {
        this.curnid = curnid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

}

