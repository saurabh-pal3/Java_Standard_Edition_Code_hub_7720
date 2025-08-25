package com.PassByValue;

public class Product 
{
	private double price=18000;


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	
	


}
