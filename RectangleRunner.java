package com.gmail.manjko;

public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle c = new Rectangle(10, 5);
		Rectangle d = new Rectangle(10, 7);
		Rectangles f = new Rectangles();
		f.addRectangle(c);
		f.addRectangle(d);
		System.out.println(f.sumArea());

	}

}
