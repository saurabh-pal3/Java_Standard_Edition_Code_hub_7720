package com.Oops;

public class Multiple {

	public static void main(String[] a) {
		int n=Integer.parseInt(a[0]);
		int next=0;
		if(n<0)
		{
			System.out.println(" return -1");
		}
		else if(n>0)
		{
			next=(n%100==0) ? n+100:((n/100)+1)*100;
			
		}
		System.out.println("Next Multiple is="+next);

	}

}
