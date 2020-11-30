package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionBeanScopeDemoApp {

	public static void main(String[] args) {

		//load spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext
				("applicationContext.xml");
		
		//retrive bean from spring conteiner
				
		TennisCoach theCoach= context.getBean
		("tennisCoach", TennisCoach.class);
		
		TennisCoach alphaCoach= context.getBean
		("tennisCoach", TennisCoach.class);
		
		boolean result = (theCoach==alphaCoach);
		
		System.out.println("\nPointing to the same objec: "+ result);
		
		System.out.println("\nMemory lcation for theCoach: "+ theCoach);
		System.out.println("\nMemory location for alphaCoach: "+ alphaCoach);
		
	}

}
