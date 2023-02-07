package com.crp.framework.dynamicdatasource.properties;

import com.crp.framework.dynamicdatasource.properties.DruidDataSourceProperties;
import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Desc:  多数据源配置属性
 * @Author 吴想想
 * @Date 2023/2/2
 */
@Data
@ConditionalOnProperty(prefix = "spring.dynamic", name = "enabled", matchIfMissing = false)
@ConfigurationProperties(prefix = "spring.dynamic")
public class DynamicDruidDataSourceProperties {
    private Map<String, DruidDataSourceProperties> datasource = new LinkedHashMap<>();
}
