package com.gmail.manjko;

public class Rectangle {
	private double a;
	private double b;
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Rectangle() {
		super();
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
	
	public double getPerimetr() {
		return (a + b) * 2;
	}

	public double getArea() {
		return a * b;
	}

	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}

	
}
