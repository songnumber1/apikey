package com.example.apikey.Config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.apikey.Filter.ApiKeyFilter;

@Configuration
public class FilterConfig {
    @Bean
	public FilterRegistrationBean<ApiKeyFilter> filter1(){
		FilterRegistrationBean<ApiKeyFilter> bean = new FilterRegistrationBean<>(new ApiKeyFilter());
		bean.addUrlPatterns("/*");
		bean.setOrder(1);
		
		return bean;
	}
}
