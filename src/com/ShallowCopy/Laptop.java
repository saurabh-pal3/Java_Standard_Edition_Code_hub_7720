package com.ShallowCopy;


 class kalu
{
	 private double price;

	 public kalu(double price) {
		super();
		this.price = price;
	 }

	 public double getPrice() {
		return price;
	}

	 public void setPrice(double price) {
		 this.price = price;
	 }

	 @Override
	 public String toString() {
		return "kalu [price=" + price + "]";
	 }
	
}

public class Laptop {

	public static void main(String[] args)
	{
		kalu k1=new kalu(2000);
		System.out.println("befor chnage"+k1.getPrice());
		ss(k1);
		System.out.println("after chnage "+k1.getPrice());
		

	}
	public static void ss(kalu ka)
	{
		ka.setPrice(1000);
	}
	

}
