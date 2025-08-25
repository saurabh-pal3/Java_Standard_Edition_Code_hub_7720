package com.Opeater;

import java.util.Scanner;

public class SwitchLab1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day is[Weekday /Weekend] :" );
		String day= sc.nextLine().toUpperCase();
		
		 switch(day)
		{
		case "MONDAY","TUESDAY","WEDNESDAY ","THURSDAY","FRIDAY" ->System.out.println(day+ "is a Weekday");
		case "SATURDAY","SUNDAY"  -> System.out.println(day + "is a Weekend");
		
		default -> System.out.println("is a Weekend");
		}
		 sc.close();

	}

}
