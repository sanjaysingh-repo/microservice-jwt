package com.techturtles.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import com.techturtles.common.config.AppProperties;



@SpringBootApplication
@EnableEurekaClient 	// It acts as a eureka client
@EnableZuulProxy		// Enable Zuul
@EnableConfigurationProperties(AppProperties.class)
public class SpringZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulApplication.class, args);
	}
}