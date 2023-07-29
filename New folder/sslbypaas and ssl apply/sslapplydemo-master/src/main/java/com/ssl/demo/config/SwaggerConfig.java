package com.ssl.demo.config;

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
 * @author - Avanish Kumar
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swagConfig(){
       return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.ssl.demo.controller"))
                .build()
               .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo("SSL Apply application",
                "Documentation for SSL Apply application",
                "1.0",
                "Terms of service for using SSL Apply application",
                new Contact("Avanish Kumar","https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA","greenlearner01@gmail.com"),
                "MIT Licence",
                "https://opensource.org/licenses/MIT",
                new ArrayList<>()
        );
    }
}


