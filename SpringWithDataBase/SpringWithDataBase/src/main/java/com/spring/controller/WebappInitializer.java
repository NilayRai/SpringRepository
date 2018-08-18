package com.spring.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebappInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { PersonConfiguration.class };
	}

	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { PersonConfiguration.class };
	}

	protected String[] getServletMappings() {
		System.out.println("**getServiceMappings");
		return new String[] { "*.jlc" };

	}
}