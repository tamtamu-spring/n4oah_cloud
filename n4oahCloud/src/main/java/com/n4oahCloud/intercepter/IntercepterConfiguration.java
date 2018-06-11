package com.n4oahCloud.intercepter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.n4oahCloud.logging.LoggingIntercepter;

@Configuration
public class IntercepterConfiguration extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoggingIntercepter())
				.addPathPatterns("/**/*.do");
	}
}
