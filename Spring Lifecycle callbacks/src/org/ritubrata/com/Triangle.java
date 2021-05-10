package org.ritubrata.com;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * ApplicationContextAware used to get the context object which can be used to get 
 * bean info from any places except main class.
 * @author oxford
 *
 */

public class Triangle implements InitializingBean, DisposableBean{

	private Point pointA;  //if in bean.xml --> Autowire = byName then there should be bean id as pointA in bean.xml , pointa will give error. 
	private Point pointB;
	private Point pointC;

	public void draw() {
		System.out.println("Point A : " + getpointA().getX() + " , " + getpointA().getY());
		System.out.println("Point B : " + getPointB().getX() + " , " + getPointB().getY());
		System.out.println("Point C : " + getPointC().getX() + " , " + getPointC().getY());
	}

	public Point getpointA() {
		return pointA;
	}

	public void setpointA(Point pointA) {
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
	
	public void abc(){
		System.out.println("myInit been has been called for trianlge");
	}
	
	public void def(){
		System.out.println("my destroy been has been called for trianlge");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing been has been called for trianlge");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying been has been called for trianlge");		
	} 

}
