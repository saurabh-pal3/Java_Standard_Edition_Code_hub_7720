package Employee;

import java.util.Scanner;

public class ProductGet {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of product? :");
		int n=Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=n;i++)
		{
			Product p1=Product.createProductObject();
			p1.calculateTotalAmount();
			System.out.println(p1);
			double total = p1.calculateTotalAmount();
			System.out.println("Total Amount (after discount): " +total );
		}
		
		
	}

}
