package org.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"org.example.springcloud"})
@ComponentScan("org.example.springcloud")
public class Consumer_Dept_Feign_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(Consumer_Dept_Feign_App.class, args);
	}
}
