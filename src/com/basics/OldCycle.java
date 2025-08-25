package com.basics;

public class OldCycle {

	public static void main(String[] s) {
		int cycleprice=1200;
		int repairs=250;
		int coloring=350;
		int accessories=500;
		int disiredprice=1500;
		
		
		int totlecost=cycleprice+repairs+coloring+accessories;
		int totlesellingprice=totlecost+disiredprice;
		
		System.out.println("selling price="+totlesellingprice);

	}

}
