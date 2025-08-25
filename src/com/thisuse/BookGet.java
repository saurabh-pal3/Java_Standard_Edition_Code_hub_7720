package com.thisuse;

public class BookGet {

	public static void main(String[] args) {
		Book kaka=new Book("Book", "pal", 1200);
		kaka.applyDiscount(10);
		System.out.println(kaka);

	}

}
