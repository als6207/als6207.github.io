package com.mcnc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
	/*
	 * @RequestMapping(value = "/main/registerr", method = {RequestMethod.GET,
	 * RequestMethod.POST}) public ModelAndView mainPage(ModelAndView mv) {
	 * 
	 * mv.addObject("id", mv.getViewName("id"));
	 * 
	 * mv.setViewName("register"); return mv;
	 * 
	 * }
	 */
	@RequestMapping("/home/register")
	public String home() {
		return "register";
	}
	
	@RequestMapping("/home/login")
	public String login() {
		return "login";
	}
	
	
   

}
