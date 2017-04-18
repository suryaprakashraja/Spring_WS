package com.surya_spring.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDBDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDBDemoApplication.class, args);
	}
	
	/*@Bean
	public ServletRegistrationBean h2servletRegistration() {
	    ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
	    registration.addUrlMappings("/console/*");
	    return registration;
	}*/
}
