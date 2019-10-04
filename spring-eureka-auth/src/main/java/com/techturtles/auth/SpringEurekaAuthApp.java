package com.techturtles.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.techturtles.common.config.AppProperties;


@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties(AppProperties.class)
public class SpringEurekaAuthApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaAuthApp.class, args);
	}
}
