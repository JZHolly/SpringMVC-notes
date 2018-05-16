package com.southwind.controller;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BindHandler {
  
	@RequestMapping("/baseType")
	@ResponseBody
 public String baseType(int id) {
	return "id="+id;
  }
 @RequestMapping("/packageType")
 @ResponseBody
 public String packageType(@RequestParam(value="num",required=false,defaultValue="11")Integer id){
		return  "id="+id;
	}
 @RequestMapping("/arrayType")
 @ResponseBody
 public String arrayType(String[] name) {
	System.out.println(Arrays.toString(name)); 
	return Arrays.toString(name);
	 
 }
 
}
