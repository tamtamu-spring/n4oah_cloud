package com.n4oahCloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.n4oahCloud.service.TestService;

@Controller
public class MainController {
	@Autowired
	TestService testService;
	
	@RequestMapping("/main.do")
	public void main() {
		System.out.println(testService.getList());
		System.out.println("main 실행");
	}
}
