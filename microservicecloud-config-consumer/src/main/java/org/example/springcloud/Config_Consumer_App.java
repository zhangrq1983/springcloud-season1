package org.example.springcloud;

import org.example.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
@RibbonClient(name="MICROSERVICECLOUD-CONFIG-PROVIDER",configuration=MySelfRule.class)
//@RibbonClient(name="MICROSERVICECLOUD-CONFIG-PROVIDER")
public class Config_Consumer_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(Config_Consumer_App.class, args);
	}
}
