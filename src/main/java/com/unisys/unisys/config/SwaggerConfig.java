package com.unisys.unisys.config;


import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket jobApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.unisys.unisys"))
                .paths(regex("/.*"))
                .build()
                .apiInfo(metaInfo());
    }
	
	    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Unisys API REST",
                "Building the back-end Application",
                "Version v2",
                "Terms of Service",
                new Contact("Victor Hugo", "https://github.com/victorhnb",
                        "victor_nascimento1996@hotmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<>()
        );

        return apiInfo;
    }

}