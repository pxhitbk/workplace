package com.prac.viettravel.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prac.service.GenericDao;
import com.prac.util.ServiceResolver;
import com.prac.viettravel.model.Tour;

@Controller
public class HomeController {

	@RequestMapping({ "/", "/home" })
	public String showHomePage(Map<String, Object> model) {
		model.put("tours", ServiceResolver.findService(GenericDao.class).findAll(Tour.class));
		return "home";
	}

}
