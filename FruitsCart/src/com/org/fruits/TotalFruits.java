package com.org.fruits;

import javax.swing.JOptionPane;
public class TotalFruits {
	static String itemScan;
	static String firstName; 
	static String surName;
	static int age;
	static double priceBanana = 10;
	static double priceApple =15;
	static double priceMilk = 25;
	static double priceOrange = 20;
	public static String printWelcomeMessage () {
		firstName = JOptionPane.showInputDialog("Enter your name:");
		surName = JOptionPane.showInputDialog("Enter your surname:");
		String sAge = JOptionPane.showInputDialog("Enter your age:");
		age = Integer.parseInt(sAge);
		do {
			itemScan = JOptionPane.showInputDialog(surName + ", " + firstName + "("+age+"). Welcome to our supermarket! Start Scanning items. To stop, enter \'EXIT\'");
		}
		while (!itemScan.equalsIgnoreCase("Exit"));
		return itemScan;
	}
	public static double startScanning() {
		double newpriceBanana = 0;
		double newpriceMilk = 0;
		double newpriceApple = 0;
		double newpriceOrange = 0;
		for (int i = 0; itemScan.equalsIgnoreCase("Banana"); i++ ) {
			newpriceBanana = i*priceBanana;
		}
		for (int i = 0; itemScan.equalsIgnoreCase("Apple"); i++) {
			newpriceApple = i*priceApple;

		}
		for (int i = 0; itemScan.equalsIgnoreCase("Milk"); i++) {
			newpriceMilk = i*priceMilk;

		}
		for (int i = 0; itemScan.equalsIgnoreCase("Orange Juice"); i++) {
			newpriceOrange = i*priceOrange;
		} 


		double totalPrice = newpriceBanana + newpriceApple + newpriceMilk + newpriceOrange;
		return totalPrice;
	}
	public static void processItem() {
		if (itemScan.equalsIgnoreCase("Apple") || itemScan.equalsIgnoreCase("Banana")) {
			priceBanana = priceBanana- (0.1*priceBanana);
			priceApple = priceApple- (0.1*priceApple);
		}
		else {
			priceMilk = priceMilk + (0.2*priceMilk);
			priceOrange = priceOrange + (0.2*priceOrange);
		}

	}

	public static String printReceipt() {
		String cardNumber = JOptionPane.showInputDialog("Please enter your 16-digit Credit Card Number:");
		int cardNum = Integer.parseInt(cardNumber.substring(12,16));
		String information =  "Printing Receipt...\n"+"Credit Card Number ends in: "+ cardNum + "\nTotal Amount: $"+ startScanning();

		return information;
	}
	public static void main(String[] args) {
		printWelcomeMessage();
		processItem();
		startScanning();
		JOptionPane.showMessageDialog(null, printReceipt());
	}
}
