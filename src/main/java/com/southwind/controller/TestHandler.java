package com.southwind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestHandler {
	
	@RequestMapping("/index")
	public String index(){
		System.out.println("执行了index的业务方法");
		return "index";
	}
	
}