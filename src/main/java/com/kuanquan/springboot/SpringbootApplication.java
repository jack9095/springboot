package com.kuanquan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 用于启动程序的类
 * bug解决：https://blog.csdn.net/coyotess/article/details/80637837
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
