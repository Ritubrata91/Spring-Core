package org.ritubrata.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	/**
	 * BeanFactory factory = new XmlBeanFactory(new
	 * FileSystemResource("Spring.xml")) XmlBeanFactory is deprecated .
	 * ApplicationContext context = new
	 * ClassPathXmlApplicationContext("Spring.xml"); Resource leak: 'context' is
	 * never closed
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml")) {			
			Shape shape = (Shape) context.getBean("circle");
			shape.draw();
		}
	}
}
