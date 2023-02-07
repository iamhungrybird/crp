package com.crp.config;

import com.crp.common.swagger.BaseSwaggerConfig;
import com.crp.common.swagger.SwaggerProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;

/**
 * @Desc: Swagger API文档相关配置
 * @Author 吴想想
 * @Date 2023/1/12
 */
@EnableSwagger2
@Configuration
@ConditionalOnProperty(name = "swagger.show", havingValue = "true",
        matchIfMissing = false)
public class Swagger2Config extends BaseSwaggerConfig {
    /**
     * 自定义Swagger配置
     */
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.crp")
                .title("项目骨架")
                .description("项目骨架相关接口文档")
                .contactName("wxx")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

    /**
     * 设置需要登录认证的路径
     *
     * @return
     */
    @Override
    protected List<String> securityPaths() {
        return Arrays.asList("/api/*");
    }


}
