package com.n4oahCloud.logging;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import groovy.util.logging.Slf4j;

/**
 * 
 * <pre>
 * com.n4oahCloud.logging
 * LoggingIntercepter.java
 * </pre>
 *
 * @Author 		: n4oah
 * @Date 		: 2018. 6. 10.
 * @Virsion		:
 */
@Slf4j
public class LoggingIntercepter implements HandlerInterceptor {
	/**
	 * 
	 * <pre>
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 * </pre>
	 *
	 * @Author		: n4oah
	 * @Date		: 2018. 6. 10.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		return false;
	}
	
	/**
	 * 
	 * <pre>
	 * @param request
	 * @param response
	 * @param handler
	 * @param modelAndView
	 * @throws Exception
	 * </pre>
	 *
	 * @Author		: n4oah
	 * @Date		: 2018. 6. 10.
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		
		
	}

	/**
	 * 
	 * <pre>
	 * @param request
	 * @param response
	 * @param handler
	 * @param ex
	 * @throws Exception
	 * </pre>
	 *
	 * @Author		: n4oah
	 * @Date		: 2018. 6. 10.
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
		
	}
}
