package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Student {
	@RequestMapping("/")
	public String display() {
		return "index";
	}
}
