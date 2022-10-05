package com.lfp.AcmeRopa.Config;

import java.util.Collections;
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
        public Docket apiDocket(){
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.lfp.AcmeRopa.Controladores"))
                    .build()
                    .apiInfo(new ApiInfo("Acme Clothing App",
                            "app para Acme Ropa",
                            "1.2.4", "Free",
                            new Contact("Luis", "AcmeRopa.com", "acme@acme.es"),
                            "FREE", "http://license.com", Collections.emptyList()));
        }
    }

