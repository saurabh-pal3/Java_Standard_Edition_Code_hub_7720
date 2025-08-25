package com.thisuse;

import java.util.Scanner;

public class SaurabhGetincremen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the id :");
		int id=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter the name :");
		String name=sc.nextLine();
		
		System.out.print("Enter the salary :");
		double salary=Double.parseDouble(sc.nextLine());
		
		SaurabhSalaryIncrement babu=new SaurabhSalaryIncrement(id, name, salary);
		System.out.println(babu);
		
		System.out.print("Enter the Increment amount :");
		int amount=Integer.parseInt(sc.nextLine());
		
		babu.setSalary(babu.getSalary()+amount);
		System.out.println(babu);
		sc.close();
	}

}
