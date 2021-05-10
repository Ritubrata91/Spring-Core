package com.ritubrata;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	/**
	 *  BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml")) XmlBeanFactory is deprecated .
	 *  ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");  Resource leak: 'context' is never closed
	 * @param args
	 */

	public static void main(String[] args) {
		
		 try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml")){
			 Triangle triangle = (Triangle)context.getBean("triangle");  // bean name is case sensitive Triangle will throw error.
			 triangle.draw();
		 }
		
	}
}
