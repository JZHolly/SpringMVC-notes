package com.southwind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.southwind.entity.User;

@Controller
@RequestMapping(value="/login")
public class LoginHandler {

	@RequestMapping(value="/index",method=RequestMethod.GET,params={"id","name=zhangsan"})
	public String index(@RequestParam("id")int num){
		System.out.println(num);
		return "index";
	}
	
	@RequestMapping("/cookieTest")
	public String getCookie(@CookieValue("JSESSIONID")String sessionId){
		System.out.println(sessionId);
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(User user){
		System.out.println(user);
		return "index";
	}
}
