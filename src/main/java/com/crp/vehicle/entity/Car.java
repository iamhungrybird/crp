package com.crp.vehicle.entity;

import java.util.Date;
import java.io.Serializable;

import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (Car)实体类
 *
 * @author wxx
 * @since 2023-01-28 15:25:31
 */
@ApiModel("")
@Data
public class Car implements Serializable {
    private static final long serialVersionUID = 261641921255403608L;
    /**
     * 车辆ID
     */
    @ApiModelProperty("车辆ID")
    private Integer cid;
    /**
     * 车牌号
     */
    @ApiModelProperty("车牌号")
    private String num;
    /**
     * 品牌
     */
    @ApiModelProperty("品牌")
    private String brand;
    /**
     * 车辆型号
     */
    @ApiModelProperty("车辆型号")
    private String model;
    /**
     * 车辆颜色
     */
    @ApiModelProperty("车辆颜色")
    private String color;
    /**
     * 车辆类型
     */
    @ApiModelProperty("车辆类型")
    private String cartype;
    /**
     * 保险截止日期
     */
    @ApiModelProperty("保险截止日期")
    private Date insurancedeadline;
    /**
     * 里程数（含统计截止日期）
     */
    @ApiModelProperty("里程数（含统计截止日期）")
    private Integer mileage;
    /**
     * 载客人数
     */
    @ApiModelProperty("载客人数")
    private Integer capacity;
    /**
     * 车辆状态   忙碌 可用 维修
     */
    @ApiModelProperty("车辆状态   忙碌 可用 维修")
    private String carstate;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public Date getInsurancedeadline() {
        return insurancedeadline;
    }

    public void setInsurancedeadline(Date insurancedeadline) {
        this.insurancedeadline = insurancedeadline;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getCarstate() {
        return carstate;
    }

    public void setCarstate(String carstate) {
        this.carstate = carstate;
    }

}

