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
		double change = cashPaid - itemPrice +0.0005;
		if (change == 0) {
			System.out.println("Paid Exact Amount, No Change Provided");

		} else if (change < 0) {
			System.out.println("You didn't give the cashier enough money and were forcibly removed");
		}
		else {
			System.out.printf("Your change is $%.2f\n", change);
		}
		
		if (change >= 20.00) {
			int twentyBill = (int)(change/20);
			System.out.println("Here is " + twentyBill + " twenty dollar bill" +"(" + "s" + ")");
			change -= twentyBill*20;
			
		}
		if (change >= 10.00) {
			int tenBill = (int)(change/10);
			System.out.println("Here is " + tenBill + " ten dollar bill" +"(" + "s" + ")");
			change -= tenBill*10;
		}
		if (change >= 5.00) {
			int fiveBill = (int)(change/5);
			System.out.println("Here is " + fiveBill + " five dollar bill" +"(" + "s" + ")");
			change -= fiveBill*5.00;
		}
		if (change >= 1.00) {
			int oneBill = (int)(change/1.00);
			System.out.println("Here is " + oneBill + " one dollar bill" +"(" + "s" + ")");
			change -= oneBill*1;
		} else {
//			change = change + 0.0005;
		}
		
		if (change >= 0.25) {
			double twentyFiveCoin = (int)(change/0.25);
			System.out.println("Here is " + twentyFiveCoin + " quarter" +"(" + "s" + ")");
			change -= twentyFiveCoin*0.25;
		}
		if (change >= 0.10) {
			double tenCoin = (int)(change/0.10);
			System.out.println("Here is " + tenCoin + " dime" +"(" + "s" + ")");
			change -= tenCoin*0.10;
		}
		if (change >= 0.05) {
			double fiveCoin = (int)(change/0.05);
			System.out.println("Here is " + fiveCoin + " nickel" +"(" + "s" + ")");
			change -= fiveCoin*0.05;
		}
		
		if (change >= 0.01) {
			int oneCoin = (int)(change/0.01);
			System.out.println("Here is " + oneCoin + " penny" +"(" + "s" + ")");
			change -= oneCoin*0.01;
		}
//		
		return change;
	} // END MAKECHANGE();

} // END CLASS
