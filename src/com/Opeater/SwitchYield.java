package com.Opeater;

import java.util.Scanner;

public class SwitchYield {
	public static  void main(String []g)
	{
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter Your performce Grade[A/B/C]");
		char grade=	sc.next().toUpperCase().charAt(0);
		double salary =40000;
		double result=switch(grade)
		{
		case 'A' ->
		{
			System.out.println("The perfromance is hight ");
			yield salary *20/100;
		}
		case 'B' ->
		{
			System.out.println("The performance is medium ");
			yield salary*15/100;
		}
		case 'C' ->
		{
			System.out.println("The perfomance is low ");
			yield salary*10/100;
		}
		default -> 0.00;
		
		};
		sc.close();
		System.out.println("The payment is = " +result);
				
				
	}

}
