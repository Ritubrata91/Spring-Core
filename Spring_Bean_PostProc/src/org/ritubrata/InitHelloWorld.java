package org.ritubrata;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;


public class InitHelloWorld implements DestructionAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(final Object bean, final String beanName)  {
		System.out.println("BeforeInitialization : " + beanName);
		return bean;  // you can return any other object as well
	}

	@Override
	public Object postProcessAfterInitialization(final Object bean, final String beanName){
		System.out.println("AfterInitialization : " + beanName);
		return bean;  // you can return any other object as well
	}

	@Override
	public void postProcessBeforeDestruction(final Object bean, final String beanName) throws BeansException {
		System.out.println("BeforeDestruction : " + beanName);
	}
}
