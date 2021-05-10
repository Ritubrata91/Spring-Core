package org.ritubrata.spring;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c = c;
	}
   public void getMessage(){
	      System.out.println("first Point is :-  (" + getA().getX() + ","+ getA().getY() + ")" );
	      System.out.println("second Point is :- (" + getB().getX() + ","+ getB().getY()+ ")");
	      System.out.println("third Point is :-  (" + getC().getX() + ","+ getC().getY()+ ")");
	      
   }
}
