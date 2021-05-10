package org.ritubrata;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class InitHelloWorld implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)  {
	      System.out.println("BeforeInitialization : " + beanName);
	      return bean;  // you can return any other object as well
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName){
	      System.out.println("AfterInitialization : " + beanName);
	      return bean;  // you can return any other object as well
	   }
}
