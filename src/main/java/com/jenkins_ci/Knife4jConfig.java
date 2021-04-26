package com.jenkins_ci;


import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@EnableKnife4j
@Configuration
public class Knife4jConfig {
    //app接口包扫描路径
    public static final String SWAGGER_SCAN_BASE_PACKAGE = "com.jenkins_ci.openAPI";
    public static final String VESION = "1.0.0";
    public static final String TAG_1 = "获取teacher类";

    @Bean(value = "createRestApi")
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build()
//                .tags(new Tag(TAG_1, "test123"))
                ;
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("我的api")
                .description("测试对接swagger2")
                .version(VESION)
                .termsOfServiceUrl("http://localhost:8888/")
                .build();
    }
}
