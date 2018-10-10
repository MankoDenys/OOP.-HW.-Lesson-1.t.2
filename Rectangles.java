package com.gmail.manjko;

import java.util.ArrayList;

public class Rectangles {
	private  ArrayList<Rectangle> rectangles = new ArrayList<>();
	
	public void addRectangle(Rectangle rectangle) {
		rectangles.add(rectangle);
	}
	
	public double sumArea() {
		double sumArea = 0;
		for(Rectangle i:rectangles) {
			sumArea += i.getArea();
		}
		return sumArea;
	}

	@Override
	public String toString() {
		return "Rectangles [rectangles=" + rectangles + "]";
	}

	
}
