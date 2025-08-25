package com.factory_design_pattern;

public class  Text
{
	private String name;
	private int countety;
	private double price;
	public Text(String name, int countety, double price)
	{
		super();
		this.name = name;
		this.countety = countety;
		this.price = price;
	}
	
	public static Text getBook()
	{
		return new Text("Saurabh", 2, 1000);
	}

	@Override
	public String toString() {
		return "Text [name=" + name + ", countety=" + countety + ", price=" + price + "]";
	}

}
