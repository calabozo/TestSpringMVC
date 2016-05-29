package com.testspringmvc.app.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationFactoryBean {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public BasicModelBean basicModelBean(){
		return new BasicModelBean();
	}
}
