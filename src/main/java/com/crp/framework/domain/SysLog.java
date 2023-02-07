package com.crp.framework.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;


/**
 * 操作日志记录表 oper_log
 *
 * @author ruoyi
 */
@Data
public class SysLog {
    private static final long serialVersionUID = 1L;

    /**
     * 日志主键
     */
    // @Excel(name = "操作序号", cellType = ColumnType.NUMERIC)
    private Long operId;

    /**
     * 操作模块
     */
    // @Excel(name = "操作模块")
    private String title;


    // @Excel(name = "业务类型", readConverterExp = "0=其它,1=新增,2=修改,3=删除,4=授权,5=导出,6=导入,7=强退,8=生成代码,9=清空数据")
    private Integer operateType;


    /**
     * 请求方法
     */
    // @Excel(name = "请求方法")
    private String method;

    /**
     * 请求方式
     */
    // @Excel(name = "请求方式")
    private String requestMethod;


    /**
     * 操作人员
     */
    // @Excel(name = "操作人员")
    private String operName;

    /**
     * 部门名称
     */
    // @Excel(name = "部门名称")
    private String deptName;

    /**
     * 操作地点
     */
    // @Excel(name = "操作地点")
    private String operLocation;

    /**
     * 请求参数
     */
    // @Excel(name = "请求参数")
    private String operParam;

    /**
     * 返回参数
     */
    // @Excel(name = "返回参数")
    private String jsonResult;

    /**
     * 操作状态（0正常 1异常）
     */
    // @Excel(name = "状态", readConverterExp = "0=正常,1=异常")
    private Integer operationState;

    /**
     * 错误消息
     */
    // @Excel(name = "错误消息")
    private String errorMsg;

    /**
     * 操作时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    // @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime operTime;
}
