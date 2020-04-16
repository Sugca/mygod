package com.mygod;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

//@MapperScan({"ins"})
@ComponentScan(basePackages = {"com.common.*","com.mygod.*"})
@ServletComponentScan
//@Profile("prod")	//选择运行环境
//@PropertySource(value = "classath:application.yml",ignoreResourceNotFound = true,encoding = "UTF-8")
public class MyGodApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyGodApplication.class, args);

//		new SpringApplicationBuilder(SpringBootApplication.class)
//				.properties("spring.config.location=classpath:/application-dev.properties").run(args);
	}
}
