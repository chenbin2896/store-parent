package com.auction.store.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author User
 * @date 2019/9/28
 * @description
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.auction.store.account.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    //配置在线文档的基本信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("拍卖网用户管理中心")
                .description("git地址：https://github.com/xiaoguangdong999/auction-store_1.0.0_TEST_2019_09_26")
                .termsOfServiceUrl("http://xixi.natapp4.cc/account/swagger-ui.html")
                .version("1.0")
                .build();
    }


}
