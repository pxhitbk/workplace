package com.prac.viettravel.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	public String showHomePage() {

		return "home";
	}
}
