package com.hoa;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;





@SpringBootApplication

public class HoaApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HoaApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(HoaApplication.class);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				   .select()
				   .paths(PathSelectors.ant("/hoa/api/**"))
				   .apis(RequestHandlerSelectors.basePackage("com.hoa"))
				   .build()
				   .apiInfo(apiCustomData());
		
	}
	
	private ApiInfo apiCustomData() {
		return new ApiInfo("HOA_Service Application",
				           "HOA_Service Application Documentation",
				           "1.0",
				           "HOA_Service Application Terms", 
				           new Contact("HOA Board", "http://localhost:8081/hoa", "arunachalamselvam9965@gmail.com"),
				           "HOA Licence", 
				           "http://localhost:8081/hoa",
							Collections.emptyList()
							);
	}
	

}
