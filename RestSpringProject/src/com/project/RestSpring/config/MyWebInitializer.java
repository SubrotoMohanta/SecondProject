package com.project.RestSpring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses()-Start servlet reading SpringWebConfig class ");
		return new Class[] { SpringWebConfig.class };
	}
  
	@Override
	protected String[] getServletMappings() {
		System.out.println("Get URl ServletMappings");
		return new String[] { "/" };
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses()-Start root reading SpringWebConfig class");
		return new Class[]{SpringWebConfig.class};
	}
	
}

