package com.testspringmvc.app.config;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tngtech.jgiven.integration.spring.EnableJGiven;

@Configuration
// auto configuration for JGiven
@EnableJGiven
@ComponentScan(basePackages = { "com.testspringmvc.app.data", "com.testspringmvc.app.scenario" })
public class TestSpringConfig {
	/*
	 * example for non-invasive usage of the {@link SpringStepMethodInterceptor}
	 * 
	 * @return BeanNameAutoProxyCreator that proxies regular spring beans
	 */
	@Bean
	public BeanNameAutoProxyCreator jGivenBeanNameAutoProxyCreator() {
		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
		beanNameAutoProxyCreator
		.setInterceptorNames(new String[] { "springStepMethodInterceptor" });
		return beanNameAutoProxyCreator;
	}
}
