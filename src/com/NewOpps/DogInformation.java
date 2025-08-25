package com.NewOpps;

import java.util.Scanner;

class DogInformation
{
	public static void main (String[]args)
	{
		Dog money = new Dog();
		
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the dog name :" );
		 money.name=sc.nextLine();
		System.out.print("Enter the dog Bried :");
		money. bried=sc.nextLine();
		System.out.print("Enter the Age of dog :");
		money. age=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Dog Heigt :");
		money. height=Double.parseDouble(sc.nextLine());
		System.out.print("The dog colour :");
		money. colur=sc.nextLine();
		System.out.print("Enter the dog Type :");
		money. type=sc.nextLine();
		System.out.print("Enter the work of dog");
		money. work=sc.nextLine();
		System.out.print("Enter the work plece :");
		money. place=sc.nextLine();
		
		money.intro();
		money.gard();
		sc.close();
	}
}

		
