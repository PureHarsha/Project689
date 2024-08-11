package com.database.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.database.model.Student;

@RestController
public class MyController {

	@RequestMapping("/")
	public ModelAndView goToHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("firstPage"); //JSP file name
		return modelAndView;
	}
	
	@RequestMapping("/loginRegister")
	public ModelAndView goToLoginRegister() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("studentData", new Student());
		modelAndView.setViewName("loginRegister"); //JSP file name
		return modelAndView;
	}
	
	@RequestMapping("/register")
	public ModelAndView doRegister(@ModelAttribute("studentData") Student stu) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(stu.toString());
		return modelAndView;
	}
	
}
