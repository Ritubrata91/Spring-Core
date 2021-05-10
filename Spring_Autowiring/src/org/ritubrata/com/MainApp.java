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
	 *Author Ritubrata
	 *
	 */

	public static void main(final String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml")) {
			final Triangle triangle = (Triangle) context.getBean("triangle");
			triangle.draw();
		}

	}
}
