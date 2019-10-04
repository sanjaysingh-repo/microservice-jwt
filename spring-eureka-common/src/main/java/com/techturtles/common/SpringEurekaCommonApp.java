package com.techturtles.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import com.techturtles.common.config.AppProperties;



@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
@ComponentScan("com.techturtles.common")
public class SpringEurekaCommonApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaCommonApp.class, args);
	}
}
