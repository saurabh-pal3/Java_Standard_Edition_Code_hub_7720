package com.factory_design_pattern;

import java.util.Scanner;

public class Rectangle {
	
	private double width;
	private double height;
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double  getArea()
	{
		return width*height;
		
	}
	
	public double getPerimeter()
	{
		return 2*(width+height);
	}
	
	
	
}

