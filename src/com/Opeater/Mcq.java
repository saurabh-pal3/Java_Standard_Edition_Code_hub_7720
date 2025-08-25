package com.Opeater;

import java.util.Scanner;

public class Mcq {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the mark");
		String m=sc.next();
		String result=switch(m.length())
				{
		case 1 ->"The lenth is 1";
		
		case 2 ->
		{
			System.out.println("The lenth is 2");
			yield "B";
		}
		case 3 ->
		{
			System.out.println("The lenth is 3");
			yield "F";
		}
		default -> "Fail";
		
		
				};
				System.out.println("Your grade="+result);
				sc.close();
        }
	
	}


