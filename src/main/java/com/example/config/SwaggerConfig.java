package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author : bestrookie
 */
@Configuration
@EnableSwagger2 //开启swagger
public class SwaggerConfig {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("bestrookie")
                .enable(true)//enable是否启动swagger，如果为False，则swagger不能在浏览器访问
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.controller"))//此处配置的为包扫描还有别的扫描方式
                .build();
    }
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("1");
    }
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("2");
    }
    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("3");
    }
//配置Swagger信息=apiInfo
    private ApiInfo apiInfo() {
        //作者信息
        Contact contact = new Contact("bestrookie","http://bestrookie.cn","******");
        return new ApiInfo(
                "SwaggerAPI文档",
                "一个简单的demo",
                "v1.0",
                "http://bestrookie.cn",
                contact,
                "Apache2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
                );
    }
}
