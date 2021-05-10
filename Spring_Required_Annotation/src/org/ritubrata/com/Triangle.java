package org.ritubrata.com;

import org.springframework.beans.factory.annotation.Required;

/**
 * Constructor Injection does not work with setter injection having @required annotaion
 * @author oxford
 *
 */
public class Triangle {
	private String type ;
	
		
	
	/*@Required
	public void setType(String type) {
		this.type = type;
	}*/
	public void draw(){
		System.out.println( " Triangle Drawn");
	}

}
