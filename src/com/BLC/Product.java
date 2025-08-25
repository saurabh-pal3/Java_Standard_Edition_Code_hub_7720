package com.BLC;

public class Product 
{
	int productId;
	String productName;
	double productPrice;



public void setdata(int id,String name,double price)
{
	productId=id;
	 productName=name;
	 productPrice=price;
	 
}
public void getdata()
{
	System.out.println("The product id is = "+productId);
	System.out.println("The Product name is = "+productName);
	System.out.println("The product price is = "+ productPrice);
}
}