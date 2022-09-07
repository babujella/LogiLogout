package com.org.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Student {
	@RequestMapping("/hello")
	
	//Using HttpservletRequest object to get data from form and bind to respective method..
	
	/*public String display(HttpServletRequest httpServletRequest,Model model) {
		String name=httpServletRequest.getParameter("name");
		String password=httpServletRequest.getParameter("password");*/
	
	//Using @RequestParam annotation to get data from form and bind to respective method Automatically
	
	public String display(@RequestParam("name")String name,@RequestParam("password")String password,Model model) {
		
		if(password.equals("babujella")) {
			String message= "Hello"+name;
			model.addAttribute("message",message);
			return "Success";
		}
		else {
			String message="Sorry" +name +". You entered incorrect password";
			model.addAttribute("message",message);
			return "Error";
		}
	}
}
