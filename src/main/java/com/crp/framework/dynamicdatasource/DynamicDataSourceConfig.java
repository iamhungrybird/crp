package com.crp.framework.dynamicdatasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.crp.common.util.SpringContextUtils;
import com.crp.framework.dynamicdatasource.properties.DruidDataSourceProperties;
import com.crp.framework.dynamicdatasource.properties.DynamicDruidDataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc: 多数据源属性配置
 * @Author 吴想想
 * @Date 2023/2/2
 */

@Configuration
@EnableConfigurationProperties(DynamicDruidDataSourceProperties.class)
public class DynamicDataSourceConfig {


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DruidDataSourceProperties dataSourceProperties() {
        return new DruidDataSourceProperties();
    }

    @Bean
    public DynamicDataSource dynamicDataSource(DruidDataSourceProperties dataSourceProperties) {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //默认数据源
        DruidDataSource defaultDataSource = DynamicDataSourceFactory.buildDruidDataSource(dataSourceProperties);
        dynamicDataSource.setDefaultTargetDataSource(defaultDataSource);
        // 设置多数据源
        DynamicDruidDataSourceProperties dynamicDruidDataSourceProperties = null;
        if (null != (dynamicDruidDataSourceProperties = SpringContextUtils.getBean(DynamicDruidDataSourceProperties.class))) {
            dynamicDataSource.setTargetDataSources(getDynamicDataSource(dynamicDruidDataSourceProperties));
        }
        return dynamicDataSource;
    }

    private Map<Object, Object> getDynamicDataSource(DynamicDruidDataSourceProperties dynamicDruidDataSourceProperties) {
        Map<String, DruidDataSourceProperties> dataSourcePropertiesMap = dynamicDruidDataSourceProperties.getDatasource();
        Map<Object, Object> targetDataSources = new HashMap<>(dataSourcePropertiesMap.size());
        dataSourcePropertiesMap.forEach((k, v) -> {
            DruidDataSource druidDataSource = DynamicDataSourceFactory.buildDruidDataSource(v);
            targetDataSources.put(k, druidDataSource);
        });

        return targetDataSources;
    }

}
