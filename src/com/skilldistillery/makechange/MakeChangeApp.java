package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double cashPaid = 0.0;
		double itemPrice = 0.0;

		itemPrice = itemPrice();
		cashPaid = askPay();
		System.out.printf("You hand the cashier $" + cashPaid + "\n");
		makeChange(cashPaid, itemPrice);
//		makeCoinage(change);

		sc.close();
	} // END MAIN

	public static double makeCoinage(double change) {
		System.out.println("test");
		return change;
		
	}

	public static double askPay() {
		double cashPaid = 0.0;
		System.out.println("Type how much you would like to give the cashier... ");
		cashPaid = sc.nextDouble();
//		System.out.println(cashPaid); <--test code
		return cashPaid;
	}

	public static double itemPrice() {
		double itemPrice = 0.0;
		System.out.println("Enter the price of the item. ");
		itemPrice = sc.nextDouble();
//		System.out.println(); <--test code
		return itemPrice;

	} // END ITEMPRICE();

	public static double makeChange(double cashPaid, double itemPrice) {
		double change = cashPaid - itemPrice;
		if (change == 0) {
			System.out.println("Paid Exact Amount, No Change Provided");

		} else {
			System.out.println("Your change is " + change);

		}
		
		if (change >= 20.00) {
			int twentyBill = (int)(change/20);
			System.out.println("Here is " + twentyBill + " twenty dollar bill" +"(" + "s" + ")");
			change -= twentyBill*20;
			
		}
		if (change >= 10.00) {
			int tenBill = (int)(change/10);
			System.out.println("Here is " + tenBill + " ten dollar bill" +"(" + "s" + ")");
			
		}
		
		return change;
	} // END MAKECHANGE();

} // END CLASS
