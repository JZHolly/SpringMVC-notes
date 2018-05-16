package com.southwind.controller;
/**
 * 注解式数据绑定：在原生Servlet中，我们通过在doGet和doPost方法绑定web资源访问接口：
 * HttpServletRequest和HttpServletResponse到入参来进一步通过request.getParameter()等方法获取我们的web资源。
 * 在SpringMVC中，我们一样可以将HttpServletRequest和HttpServletResponse绑定到入参中使用，
 * 但除此之外，SpringMVC还能进一步分析我们处理方法的入参信息，
 * 将各类请求资源绑定到我们的方法入参上，并将数据类型转化为我们定义的类型，为我们可以节省了大量的参数获取、初始化工作。
 */
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
	public String getCookie(@CookieValue(value="JSESSIONID",defaultValue="")String sessionId){
		
		System.out.println(sessionId);
		return "index";
	
		//String sessionId,获取请求中的ID,cookieid.
	}
	
	@RequestMapping("/add")
	public String add(User user){
		System.out.println(user);
		return "index";
	}
}
