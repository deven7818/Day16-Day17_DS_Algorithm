package com.dsalgorithm;

import java.util.Scanner;


/**
 * Program to creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash.
 * input panel to add people to Queue to either deposit or withdraw money and dequeue the people. 
 *
 */
public class BankCashCounterMain {
	public static void main(String[] args) {

		BankCashCounter obj = new BankCashCounter(5);
		Scanner sc = new Scanner(System.in);
		int ch;

		while (true) {
			System.out.println(
					"\n 1. Add customer to queue\n "
					+ " 2. Remove customer from queue\n "
					+ " 3. Display queue\n "
					+ " 4. Exit");
			
			System.out.println(" Please enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print(" Please enter the name of the customer: ");
				String name = sc.next();
				System.out.print(" Please enter the amount to be debited : ");
				int amount = sc.nextInt();
				obj.enqueue(amount, name);
				break;
			case 2:
				obj.dequeue();
				break;
			case 3:
				obj.display();
				break;
			case 4:
				sc.close();
				return;
			default:
				System.out.println(" Wrong Choice");
			}
		}
	}
}