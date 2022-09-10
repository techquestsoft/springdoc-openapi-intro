package com.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(com.training.SampleApplication.class, args);
    }

    @org.springframework.context.annotation.Bean
    public io.swagger.v3.oas.models.OpenAPI customOpenAPI(@org.springframework.beans.factory.annotation.Value("${application-description}") String appDesciption, @org.springframework.beans.factory.annotation.Value("${application-version}") String appVersion) {
     return new io.swagger.v3.oas.models.OpenAPI()
          .info(new io.swagger.v3.oas.models.info.Info()
          .title("sample application API")
          .version(appVersion)
          .description(appDesciption)
          .termsOfService("http://swagger.io/terms/")
          .license(new io.swagger.v3.oas.models.info.License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
