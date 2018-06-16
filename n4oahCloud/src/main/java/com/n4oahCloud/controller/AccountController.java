package com.n4oahCloud.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping(value="/signinForm", method=RequestMethod.GET)
	public void signinForm() throws Exception {
		
	}
	
	@RequestMapping(value="/signupForm", method=RequestMethod.GET)
	public void signupForm() throws Exception  {
		
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public void signup(Account account) throws Exception {
		accountService.accountSignup(account);
	}
	
	@RequestMapping(value="/signin", method=RequestMethod.POST)
	public String signin(HttpSession session, RedirectAttributes redirAttrs, Account account) throws Exception {
		account = accountService.signin(account);
		if(account == null) {
			redirAttrs.addFlashAttribute("message", "아이디 혹은 비밀번호가 옳지 않습니다.");
			return "redirect:/account/signinForm";
		}
		
		session.setAttribute("user", account);
		return "redirect:/main";
	}
	
	@RequestMapping(value="/signout", method=RequestMethod.DELETE)
	public String signout() throws Exception {
		return "redirect:/main";
	}
	
	@RequestMapping(value="/signupSuccess", method=RequestMethod.GET)
	public void signupSuccess() throws Exception {
		
	}
	
	@ResponseBody
	@RequestMapping(value="/overlapChk", method=RequestMethod.GET)
	public int idOberlapChk(Account account) throws Exception {
		return accountService.overlapCheck(account);
	}
}