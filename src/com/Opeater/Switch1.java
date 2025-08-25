package com.Opeater;

import java.util.Scanner;

public class Switch1 {
	

	public static void main(String[] a)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a charester =");
		char color = sc.next().toLowerCase().charAt(0);
		switch(color)
		{
		case 'r' -> System.out.println("Red");
		
		case 'p' -> System.out.println("pink");
		
		case 'w' -> System.out.println("white");
		
		case 'b' -> System.out.println("Blue");
		
		default -> System.out.println("lavade ho tum");
		}
		
		sc.close();
	}

}
