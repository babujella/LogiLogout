package com.org.multiplecontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	@RequestMapping("/second")
	public String disply2() {
		return "index2";
	}
}
