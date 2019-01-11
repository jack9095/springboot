package com.kuanquan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 用于启动程序的类
 * bug解决：https://blog.csdn.net/coyotess/article/details/80637837
 */
// 是 Spring Boot 的核心注解，它是一个组合注解，该注解组合了：@Configuration、@EnableAutoConfiguration、@ComponentScan；
// 若不是用 @SpringBootApplication 注解也可以使用这三个注解代替
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
