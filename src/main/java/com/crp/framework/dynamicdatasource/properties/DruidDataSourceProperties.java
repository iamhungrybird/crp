package com.crp.framework.dynamicdatasource.properties;

import lombok.Data;

/**
 * @Desc:  数据元配置属性类
 * @Author 吴想想
 * @Date 2023/2/2
 */
@Data
public class DruidDataSourceProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    /**
     * Druid默认参数
     */
    private int initialSize = 2;
    private int maxActive = 10;
    private int minIdle = -1;
    private long maxWait = 60 * 1000L;
    private long timeBetweenEvictionRunsMillis = 60 * 1000L;
    private long minEvictableIdleTimeMillis = 1000L * 60L * 30L;
    private long maxEvictableIdleTimeMillis = 1000L * 60L * 60L * 7;
    private String validationQuery = "select 1";
    private int validationQueryTimeout = -1;
    private boolean testOnBorrow = false;
    private boolean testOnReturn = false;
    private boolean testWhileIdle = true;
    private boolean poolPreparedStatements = false;
    private int maxOpenPreparedStatements = -1;
    private boolean sharePreparedStatements = false;
    private String filters = "stat,wall";
}
