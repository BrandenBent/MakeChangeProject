package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double cashPaid = 0.0;
		double itemPrice = 0.0;

		cashPaid = askPay();
		System.out.printf("You hand the cashier $" + cashPaid + "\n");
		itemPrice = itemPrice();
		makeChange(cashPaid, itemPrice);

	sc.close();
	} // END MAIN

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
			System.out.println("Paid Exact Amount");
			
		} else {
			System.out.println("Your change is " + change);
			
		}
			
		
		return change;
		
	}




} // END CLASS


