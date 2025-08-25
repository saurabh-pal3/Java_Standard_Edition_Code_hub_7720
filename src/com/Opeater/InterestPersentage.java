package com.Opeater;

import java.util.Scanner;

//import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class InterestPersentage {

	public static void main(String[] args) 
	{
		System.out.println("*** Choose Your Favorite Subject ***");
		System.out.println("1.C\n");
		System.out.println("2.Java\n");
		System.out.println("3.HTML\n");
		System.out.println("4.ORACAL\n");
		System.out.println("5.SPRINGBOOT\n");
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Which is your fevrite subject :");
		int n = sc.nextInt();
		System.out.print("How are you interest in this subject ? :");
		float per=sc.nextFloat();	
		if(per<=0)
		{
			System.out.println("Error: Percentage should be between 0 and 100.");
			System.exit(0);
			
		}
		switch(n)
		{
		case 1->
		{
			System.out.println("You selected C.");
			System.out.println("Your interest is"+per+ "%");
			
		}
		case 2->
		{
			System.out.println("You selected JAVA.");
			System.out.println("Your interest is"+per+ "%");
			
		}
		case 3->
		{
			System.out.println("You selected HTML.");
			System.out.println("Your interest is"+per+ "%");
			
		}
		case 4->
		{
			System.out.println("You selected ORACAL.");
			System.out.println("Your interest is"+per+ "%");
			
		}
		case 5 ->
		{
			System.out.println("You selected SPRINGBOOT.");
			System.out.println("Your interest is"+per+ "%");
			
		}
		default -> System.out.println("Invalid choice! Please select between 1 and 4.");
		
	}

}
}
