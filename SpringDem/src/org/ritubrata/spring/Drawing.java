package org.ritubrata.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {
	public static void main(String[] args) {
		
		
		/**XmlBeanFactory is deprecated.
		 * ApplicationContext is not auto closeable
		 */
		try(ClassPathXmlApplicationContext  con = new ClassPathXmlApplicationContext("spring.xml")){
		Triangle t= (Triangle)con.getBean("triangle2");
		
		t.getMessage();
		}
		
		
		
		
	}

}
