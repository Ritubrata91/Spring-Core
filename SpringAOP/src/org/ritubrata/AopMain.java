package org.ritubrata;

import org.ritubrata.service.ShapeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml")){
			ShapeService ss =  ctx.getBean("shapeservice", ShapeService.class);
			
			ss.getCircle().setName("Ritubrata");
			ss.getCircle().getName();
		}
	}

}
