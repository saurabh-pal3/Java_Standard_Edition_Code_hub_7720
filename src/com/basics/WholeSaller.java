package com.basics;

public class WholeSaller {

    public static void main(String[] s) {
        // Ensure at least one argument is passed
        if (s.length == 0) {
            System.out.println("Please enter the net bill amount as a command line argument.");
            return;
        }

        // Parse input
        int netBill = Integer.parseInt(s[0]);
        double discountPercent = 0;

        // Determine discount
        if (netBill < 5000) {
            discountPercent = 5;
        } else if (netBill < 10000) {
            discountPercent = 10;
        } else {
            discountPercent = 15;
        }

        // Calculate discount and payable amount
        double totalDiscount = (netBill * discountPercent) / 100;
        double amountPayable = netBill - totalDiscount;

        // Output the result
        System.out.println("Net Bill          = Rs. " + netBill);
        System.out.println("Discount %        = " + discountPercent + "%");
        System.out.println("Discount Amount   = Rs. " + totalDiscount);
        System.out.println("Amount Payable    = Rs. " + amountPayable);
    }
}
