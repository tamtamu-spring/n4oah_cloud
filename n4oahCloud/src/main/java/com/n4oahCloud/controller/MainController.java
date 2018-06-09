package com.n4oahCloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.n4oahCloud.service.AccountService;

/**
 * <pre>
 * com.n4oahCloud.controller
 * MainController.java
 * </pre>
 *
 * @Author 		: n4oah
 * @Date 		: 2018. 5. 3.
 */

@Controller
public class MainController {
	@Autowired
	AccountService testService;
	
	@RequestMapping("/main.do")
	public String main() {
		System.out.println(testService.getList());
		System.out.println("main 실행");
		return "main";
	}
}
