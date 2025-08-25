package Employee;

import java.util.Scanner;

public class Product
{
	private int id;
	private String name;
	private double price;
	private int quantity ;
	
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public static Product createProductObject()
	{ 
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Product id: ");
		int id= Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Product name :");
		String name=sc.nextLine();
		
		System.out.println("Enter the Product salary : ");
		double price =Double.parseDouble(sc.nextLine());
		
		
		
		System.out.println("Enter the Product quantity : ");
		int quantity=Integer.parseInt(sc.nextLine());
		sc.close();
		return new Product(id, name, price, quantity);
	}

	public double calculateTotalAmount()
	{
		double total=price*quantity;
		

        if (total > 1000) {
            total -= total * 0.10;
        } else if (total > 500) {
            total -= total * 0.05;
        }
        return total;
		
	}
	
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	



}
