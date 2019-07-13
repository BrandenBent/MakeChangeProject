package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		askPay();
		itemPrice();
		
		sc.close();
	}

	public static void askPay() {
		double cashPaid = 0.0;
		System.out.println("Enter the amount youre paying. ");
		cashPaid = sc.nextDouble();
//		System.out.println(cashPaid);
	}
	
	public static void itemPrice() {
		double itemPrice = 0.0;
		System.out.println("Enter the price of the item. ");
		itemPrice = sc.nextDouble();
//		System.out.println();
		
	}
}
