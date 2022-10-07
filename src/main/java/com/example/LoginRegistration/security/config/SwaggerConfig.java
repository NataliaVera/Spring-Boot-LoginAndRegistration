package com.example.LoginRegistration.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collection;
import java.util.Collections;

/**
 * API REST documentation
 *
 * http://localhost:8081/swagger-ui/
 */

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    public ApiInfo apiDetails(){
        return new ApiInfo(
                "Spring Boot API REST",
                "Login and Registration",
                "1.0",
                "http://www.google.com",
                new Contact(
                        "Natalia",
                        "http://www.google.com",
                        "natalia@exmaple.com"),
                "MIT",
                "http://www.google.com",
                Collections.emptyList()
        );
    }
}
