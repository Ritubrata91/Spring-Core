package org.ritubrata;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {

	   try(AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml")){
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      context.registerShutdownHook();
	   }
	}
}
