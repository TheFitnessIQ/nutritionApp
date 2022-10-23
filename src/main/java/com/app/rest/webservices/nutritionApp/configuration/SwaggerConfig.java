package com.app.rest.webservices.nutritionApp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
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
    public Docket postApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.app.rest.webservices.nutritionApp"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData());
                //.groupName("public-api")
               // .apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.app.rest.webservices.nutritionApp")).build();
    }

    private ApiInfo metaData(){

        return new ApiInfoBuilder()
                .title("Smart Nutrition App")
                .description("It provides tools for client and Nutritionist to design a smart diet chart")
                .version("1.0")
                .license("Apache 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("Rajib Sahoo","https://github.com/rajibksahoo","rajibbirn2win@gmail.com"))
                .build();

    }
}
