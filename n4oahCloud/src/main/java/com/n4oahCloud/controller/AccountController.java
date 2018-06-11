package com.n4oahCloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping(value="/signinForm.do", method=RequestMethod.GET)
	public void signinForm() throws Exception {
	}
	
	@RequestMapping(value="/signupForm.do", method=RequestMethod.GET)
	public void signupForm() throws Exception  {
	}
	
	@RequestMapping(value="/signup.do", method=RequestMethod.POST)
	public void signup(Account account) throws Exception {
		accountService.accountSignup(account);
	}
	
	@RequestMapping(value="/signin.do", method=RequestMethod.POST)
	public String signin() throws Exception {
		return "";
	}
	
	@RequestMapping(value="/signout.do", method=RequestMethod.DELETE)
	public String signout() throws Exception {
		return "redirect:/main.do";
	}
	
	@ResponseBody
	@RequestMapping(value="/idOverlapChk.do", method=RequestMethod.GET)
	public boolean idOberlapChk(Account account) throws Exception {
		return accountService.idoverlapCheck(account);
	}
}