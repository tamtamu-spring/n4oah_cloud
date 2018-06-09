package com.n4oahCloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.n4oahCloud.domain.Account;
import com.n4oahCloud.service.AccountService;

/**
 * <pre>
 * com.n4oahCloud.controller
 * AccountController.java
 * </pre>
 *
 * @Author 		: n4oah
 * @Date 		: 2018. 2. 5.
 */

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/signinForm.do")
	public void signinForm() throws Exception {
		
	}
	
	@RequestMapping("/signupForm.do")
	public void signupForm(Account account) throws Exception  {
		accountService.accountSignup(account);
	}
	
	@RequestMapping("/signout.do")
	public String signout() throws Exception {
		
		return "";
	}
}