package com.Oops;

public class Sumtwo {

	public static void main(String[] a) {
		int n=Integer.parseInt(a[0]);
		int sum=0;
		int r=0;
		int last=0;
		int first=0;
		if(n<=0)
		{
			System.out.println("the given value is : "+n);
			
		  
		}
	
		else if(n>99)
		{
			System.out.println("-2");
		}
		else if(n>0&&n<9)
		{
			System.out.println("-1");
		}
		else if(n>=10&&n<=99)
		{
			 last =n%10;
			 first = n/10;
			 sum = first + last;
		
			System.out.println("Sum="+sum);
			
		}
		}
		
		


	}


