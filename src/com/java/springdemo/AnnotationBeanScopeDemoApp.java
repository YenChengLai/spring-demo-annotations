package com.java.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach duplicateCoach = context.getBean("tennisCoach", Coach.class);

		// check memory place
		System.out.println("Memory of theCoach: " + theCoach);
		System.out.println("Memory of duplicateCoach: " + duplicateCoach);

		// check if beans are the same
		System.out.println(theCoach == duplicateCoach);

		// close the context
		context.close();
	}

}
