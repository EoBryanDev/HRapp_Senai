package com.hr.app.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
	
	
	@RequestMapping(value= "/")
	public ModelAndView openIndex() {
		ModelAndView mv = new ModelAndView("index");
		
		String msg = "Research App!";
		
		mv.addObject("msg", msg);
		return mv;
	}
	
	@RequestMapping(value= "/" , method = RequestMethod.POST)
	public ModelAndView searchIndex(@RequestParam("search") String search) {
		ModelAndView mv = new ModelAndView("index");
		String msg = "Search Result!";
		mv.addObject("msg", msg);
		mv.addObject("search", search);
		
		return mv;
	}

}
