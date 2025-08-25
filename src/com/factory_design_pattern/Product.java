package com.factory_design_pattern;

import java.util.Scanner;

public class Product
{
	private String ProductName;
	private int id;
	private double Price;
	
	public Product(String productName, int id, double price) 
	{
		super();
		ProductName = productName;
		this.id = id;
		Price = price;
	}
	
	public static Product getproduct()
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the product name: ");
		String ProductName=sc.nextLine();
		
		System.out.println("Enter the product id: ");
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the product price :");
		double price=Double.parseDouble(sc.nextLine());
		
		return new Product(ProductName, id, price);

		
	}
	
	

	@Override
	public String toString() {
		return "Product [ProductName=" + ProductName + ", id=" + id + ", Price=" + Price + "]";
	}
	
	


}

