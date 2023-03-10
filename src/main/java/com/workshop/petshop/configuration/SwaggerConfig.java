package com.workshop.petshop.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfig {

    private static final String SWAGGER_API_VERSION = "1.0";
    private static final String SWAGGER_API_TITLE = "Pet Shop";
    private static final String SWAGGER_API_DESCRIPTION = "A REST API made for managing integrations";

 
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false);
    }     
                
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(SWAGGER_API_TITLE)
                .description(SWAGGER_API_DESCRIPTION)
                .version(SWAGGER_API_VERSION)
                .build();
    }
    
}
