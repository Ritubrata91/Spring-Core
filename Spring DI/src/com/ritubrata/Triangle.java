package com.ritubrata;


/**
 * Setter gets more priority than constructor injection. Check Spring.xml and run DrawingApp
 * 
 * Sequence of variable in constructor definition is being verified as per Spring.xml. So the first constructor will give error.
 * or else we have to mention like this <constructor-arg type = "int" value = "20"></constructor-arg> or
 * <constructor-arg index = "0" value = "20"></constructor-arg>
 * @author Ritubrata
 *
 */
public class Triangle {
	
	private String type;
	private int height;
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(int height) {
		this.height = height;
	}
	
	public Triangle(int height,String type) {
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw(){
		System.out.println(getType() + " Triangle Drawn of height : " + getHeight());
	}
	
	
}
