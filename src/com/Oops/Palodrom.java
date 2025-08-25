package com.Oops;

import java.util.Scanner;

public class Palodrom {
	
	

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number=");
	int n = sc.nextInt();
	int digit ,count=0,r=0,rew=0;
	int temp= n;
	while(n!=0)
	{
		n=n/10;
		count++;
	
	}
	temp=n;
	if(count>0)
	{
		if(count==3)
		{
			while(n!=0)
			{
				r=n%10;
				rew=rew*10+r;
			}
			if(n==rew)
			{
				System.out.println("pallindrome=1");
			}
			else
			{
				System.out.println(" not a pallindrome=0");
			}
				
				
		}
		else {
			System.out.println("This is only for 3 digit");
		}
	}
	else {
		System.out.println("number is negative or zero, print -1");
	}
	sc.close();

	
	

	}

}
