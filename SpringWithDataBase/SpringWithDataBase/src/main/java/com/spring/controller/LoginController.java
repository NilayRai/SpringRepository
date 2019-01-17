package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Autowired
	PersonService personservice;

	@RequestMapping(value = "/abc", method = RequestMethod.GET)
	public ModelAndView login() {
		System.out.println("Hello mahendra");
		ModelAndView m = new ModelAndView();
		m.addObject(new Personalinformation());
		System.out.println("Controler");

		System.out.println("Hello mahendra Nilay Bhai");
		System.out.println("Hello Software India");

		m.setViewName("login");
		return m;

	}

	@RequestMapping(value = "/addcontact.jlc", method = RequestMethod.POST)
	public ModelAndView addDetails(@ModelAttribute("personalinformation") Personalinformation personalinformation) {
		personservice.addperson(personalinformation);
		return new ModelAndView("welcome", "personalinformation", personalinformation);

	}
}
