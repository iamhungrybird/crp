package com.crp.vehicle.entity;

import java.io.Serializable;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (Driver)实体类
 *
 * @author wxx
 * @since 2023-01-28 15:25:31
 */
@ApiModel("")
@Data
public class Driver implements Serializable {
    private static final long serialVersionUID = 858199492700833811L;
    /**
     * 司机id
     */
    @ApiModelProperty("司机id")
    private String driveruserid;
    /**
     * 驾龄
     */
    @ApiModelProperty("驾龄")
    private Integer driverage;
    /**
     * 驾照编号
     */
    @ApiModelProperty("驾照编号")
    private String licenseid;
    /**
     * 驾照类型
     */
    @ApiModelProperty("驾照类型")
    private String licensetype;
    /**
     * 主要分为 忙碌、空闲、不可用
     */
    @ApiModelProperty("主要分为 忙碌、空闲、不可用")
    private String driverstate;


    public String getDriveruserid() {
        return driveruserid;
    }

    public void setDriveruserid(String driveruserid) {
        this.driveruserid = driveruserid;
    }

    public Integer getDriverage() {
        return driverage;
    }

    public void setDriverage(Integer driverage) {
        this.driverage = driverage;
    }

    public String getLicenseid() {
        return licenseid;
    }

    public void setLicenseid(String licenseid) {
        this.licenseid = licenseid;
    }

    public String getLicensetype() {
        return licensetype;
    }

    public void setLicensetype(String licensetype) {
        this.licensetype = licensetype;
    }

    public String getDriverstate() {
        return driverstate;
    }

    public void setDriverstate(String driverstate) {
        this.driverstate = driverstate;
    }

}

