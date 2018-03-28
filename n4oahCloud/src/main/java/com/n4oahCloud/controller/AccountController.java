package com.n4oahCloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 * com.n4oahCloud.controller
 * AccountController.java
 * </pre>
 *
 * @Author 		: n4oah
 * @Date 		: 2018. 2. 5.
 * @Virsion		:
 */

@Controller
@RequestMapping("/account")
public class AccountController {
	@RequestMapping("/signinForm.do")
	public void signinForm() {
		
	}
	
	@RequestMapping("/signupForm.do")
	public void signupForm() {
		
	}
	
	@RequestMapping("/signout.do")
	public String signout() {
		
		return "";
	}
}