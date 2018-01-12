package com.neusoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.service.IUserService;

@Controller
public class TestController {
	@Autowired
	private IUser1Service iUserService;
	@RequestMapping("/")
	public ModelAndView getUserId(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("1");
		modelAndView.addObject("lst",iUserService.getUserId());
		return modelAndView;
	}

}
