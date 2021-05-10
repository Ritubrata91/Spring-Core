package org.ritubrata.com;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * ApplicationContextAware used to get the context object which can be used to get 
 * bean info from any places except main class.
 * @author oxford
 *
 */

public class Triangle implements ApplicationContextAware , BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;

	public void draw() {
		System.out.println("Point A : " + getPointA().getX() + " , " + getPointA().getY());
		System.out.println("Point B : " + getPointB().getX() + " , " + getPointB().getY());
		System.out.println("Point C : " + getPointC().getX() + " , " + getPointC().getY());
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
		System.out.println(" Context name is : " + context);
		
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println(" Bean name is : " + arg0);
		
	}

}
