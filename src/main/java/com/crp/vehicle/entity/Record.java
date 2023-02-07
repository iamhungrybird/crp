package com.crp.vehicle.entity;

import java.util.Date;
import java.io.Serializable;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (Record)实体类
 *
 * @author wxx
 * @since 2023-01-28 15:25:32
 */
@ApiModel("")
@Data
public class Record implements Serializable {
    private static final long serialVersionUID = -24537830821131044L;
    /**
     * 出车记录ID
     */
    @ApiModelProperty("出车记录ID")
    private Integer rid;
    /**
     * 申请ID
     */
    @ApiModelProperty("申请ID")
    private Integer aid;
    /**
     * 车ID
     */
    @ApiModelProperty("车ID")
    private Integer cid;
    /**
     * 管理员ID---分配人
     */
    @ApiModelProperty("管理员ID---分配人")
    private String adminuserid;
    /**
     * 管理员分派时间
     */
    @ApiModelProperty("管理员分派时间")
    private Date assignedtime;
    /**
     * 司机ID
     */
    @ApiModelProperty("司机ID")
    private String driveruserid;
    /**
     * 司机接单时间
     */
    @ApiModelProperty("司机接单时间")
    private Date taketime;
    /**
     * 司机返程时间
     */
    @ApiModelProperty("司机返程时间")
    private Date backtime;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getAdminuserid() {
        return adminuserid;
    }

    public void setAdminuserid(String adminuserid) {
        this.adminuserid = adminuserid;
    }

    public Date getAssignedtime() {
        return assignedtime;
    }

    public void setAssignedtime(Date assignedtime) {
        this.assignedtime = assignedtime;
    }

    public String getDriveruserid() {
        return driveruserid;
    }

    public void setDriveruserid(String driveruserid) {
        this.driveruserid = driveruserid;
    }

    public Date getTaketime() {
        return taketime;
    }

    public void setTaketime(Date taketime) {
        this.taketime = taketime;
    }

    public Date getBacktime() {
        return backtime;
    }

    public void setBacktime(Date backtime) {
        this.backtime = backtime;
    }

}

