package com.douzone.jblog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.config.app.DBConfig;
import com.douzone.config.app.MyBatisConfig;

@Configuration
@ComponentScan(value= {"com.douzone.jblog.service", "com.douzone.jblog.repository"})
@Import(value= {DBConfig.class, MyBatisConfig.class})
public class AppConfig {
	
}
