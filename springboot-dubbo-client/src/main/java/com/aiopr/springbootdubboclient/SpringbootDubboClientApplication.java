package com.aiopr.springbootdubboclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:consumer.xml") //加载xml配置文件
public class SpringbootDubboClientApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(SpringbootDubboClientApplication.class, args);
	}
}
