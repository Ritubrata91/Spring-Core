package org.ritubrata.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 * Autowired first search with byType
 * if more than same type of Bean found then Qualifier and then byName
 * @author oxford
 *
 */
public class Circle implements Shape{

	private Point circleCenter;	

	public Point getCircleCenter() {
		return circleCenter;
	}
	
	@Autowired	
	@Qualifier(value = "quali")
 	public void setCircleCenter(Point circleCenter) {
		this.circleCenter = circleCenter;
	}

	@Override
	public void draw() {
		System.out.println("Circle center is " + getCircleCenter().getX() + " , "+ getCircleCenter().getY());
		
	}
}
