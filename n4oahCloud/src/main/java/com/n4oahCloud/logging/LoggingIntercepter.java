package com.n4oahCloud.logging;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

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
public class LoggingIntercepter extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(LoggingIntercepter.class);
	
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
	 * 
	 * 컨트롤러 실행 전 호출
	 * return 값 true : 
	 * return 값 false : 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("preHandle : " + request.getRequestURL());
		return true;
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
	 * 
	 * 컨트롤러 실행 후 호출 (view 페이지 로딩 전)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("postHandle : " + request.getRequestURL());
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
	 * 
	 * view 페이지 모두 출력 후 호출
	 */
	/*
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("intercepter -> afterCompletion");
	}
	*/
}
