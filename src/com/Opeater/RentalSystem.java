package com.Opeater;

import java.util.Scanner;

public class RentalSystem {
	public static void main(String[]a)
	{
		double totle=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the type of Vehical you have  Press 1 for Two Wheeler,Press 2 for Three Wheeler, Press 3 for Four Wheeler");
		int typeofvehical=sc.nextInt();
		System.out.println("Enter how many km you want to go :");
		double km=sc.nextDouble();
		
		switch(typeofvehical)
		{
		case 1 ->
		{
			System.out.println("You booked a Two Wheeler for :"+km+ "KM");
			System.out.println("Rate per KM: 5.00");
			 totle= 5*km;
			 System.out.println("Total Bill: "+totle);
		}
		case 2 ->
		{
			System.out.println("You booked a Three Wheeler for :"+km+ "KM");
			System.out.println("Rate per KM: 8.00");
			 totle= 8*km;
			 System.out.println("Total Bill: "+totle);
		}
		case 3 ->
		{
			System.out.println("You booked a  Four Wheeler for :"+km+ "KM");
			System.out.println("Rate per KM: 12.00");
			 totle= 12*km;
			 System.out.println("Total Bill: "+totle);
		}
		default -> System.out.println("INVALID BOOKING! Please select a valid vehicle type.");
		}
		sc.close();
		
		
	}

}
