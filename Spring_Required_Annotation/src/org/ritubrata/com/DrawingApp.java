package org.ritubrata.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	/**
	 *  BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml")) XmlBeanFactory is deprecated .
	 *  ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");  Resource leak: 'context' is never closed
	 * @param args
	 */

	public static void main(String[] args) {
		
		 try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml")){
			 //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
			 //ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
			 Triangle triangle = (Triangle)context.getBean("triangle");
			 triangle.draw();
		 }
		
	}
}
