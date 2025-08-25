package com.thisuse;

public class Book 
{ 
	private String title ;
	private String author;
	private double price ;
	public Book()
	{
		
	}
	
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		if(title==null||title.trim().isEmpty()||title.equals("null"));
		{
			System.out.println("The title not be empty or null !");
			System.exit(0);
			
		}
		
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author) 
	{
		if(author==null||author.trim().isEmpty()||author.equals("null"));
		{
			System.out.println("The title not be empty or null !");
			System.exit(0);
			
		}
		this.author = author;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		if(price<0)
		{
			System.out.println("The price not be zero or negetive !");
		}
		this.price = price;
	}
	public void applyDiscount(double discountPercentage)
	{
		discountPercentage=discountPercentage/100;
		price+=discountPercentage;
		System.out.println("The discount Percentage after price : "+price);
	}

	@Override
	public String toString() {
		return "Book [\ntitle=" + title + ", \nauthor=" + author + ",\n price=" + price + "]";
	}
	

}
