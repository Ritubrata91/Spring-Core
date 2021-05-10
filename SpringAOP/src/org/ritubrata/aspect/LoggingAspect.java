package org.ritubrata.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {	

	@Before("allGettersmethod())")
	public void loggingAdviceFirstGetter(JoinPoint jp){
		System.out.println("Called from :  " + jp.toString());
		System.out.println("General Advice run for first getters ");
	}

	@Before("allGettersmethod())")
	public void loggingAdviceSecondGetter(){
		System.out.println("General Advice run for second getters ");
	}


	@Pointcut("execution(public * get*(..))")
	public void allGettersmethod(){
	}
	
	
	@Pointcut("within(org.ritubrata.model..*)")
	public void allModelClassesMethod(){
	}
	
	@Before("allModelClassesMethod())")
	public void loggingAdviceForModelClassMethods(){
		System.out.println("General Advice run for methods under model package ");
	}


	@AfterReturning("args(abc)")
	public void loggingAdviceForSetters(String abc){
		System.out.println("setter method called and object name is " + abc);
	}

	@AfterThrowing(pointcut = "args(name)",throwing = "ex")
	public void loggingAdviceForException(String name, Exception ex){
		System.out.println("after exception is thrown and exception name is " + ex);
	}
}
