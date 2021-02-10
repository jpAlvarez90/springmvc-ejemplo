package com.ejemplo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
	
	@RequestMapping(path = "/error")
	public String handle(HttpServletRequest request) {
		return "error/errorPage";
	}
	
}
