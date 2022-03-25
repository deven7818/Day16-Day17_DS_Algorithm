package com.dsalgorithm;

public class BankCashCounter {

	int totalAmount = 0;
	int head = -1;
	int tail = -1;
	String queue[];

	/**
	 * Constructor
	 */
	public BankCashCounter(int size) {
		queue = new String[size];
	}

	/**
	 * enqueue method to deposit
	 */
	public void enqueue(int amount, String name) {
		if (tail < queue.length - 1) {
			queue[++tail] = name;
			totalAmount += amount;
			if (head == -1)
				head++;
			return;
		}
		System.out.println("Queue is full");
	}

	/**
	 * dequeue method to withdraw
	 */
	public void dequeue() {
		if (head < queue.length && head < tail) {
			head++;
		}
	}

	/**
	 * 
	 */
	public void display() {
		System.out.println(" QUEUE ");
		if (head > tail || head == -1) {
			System.out.println(" empty ");
			return;
		}
		for (int i = head; i <= tail; i++) {
			System.out.print(" " + queue[i]);
		}
		System.out.println();
	}
}
