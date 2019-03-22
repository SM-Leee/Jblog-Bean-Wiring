package com.douzone.jblog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.config.web.FileUploadConfig;
import com.douzone.config.web.MVCConfig;
import com.douzone.config.web.MessagesConfig;
import com.douzone.config.web.SecurityConfig;

@Configuration
@ComponentScan(value= {"com.douzone.jblog.controller"})
@Import(value={MVCConfig.class, SecurityConfig.class, MessagesConfig.class, FileUploadConfig.class})
public class WebConfig {

}
