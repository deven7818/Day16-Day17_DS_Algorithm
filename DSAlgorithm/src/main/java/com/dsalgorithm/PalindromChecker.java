package com.dsalgorithm;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromChecker {


	/**
	 * Taking the string from user to check it is palindrome or not
	 * Declared a queue to store a reversed string
	 * Reversing a user input string 
	 * Checking user input with reverse string
	 *
	 */

	/*
	 * scanner class object to take user input
	 */
	static Scanner sc = new Scanner(System.in);
	/*
	 * Declared a queue to store a reversed string
	 */
	static Queue<Character> queue = new LinkedList<>();

	public static void main(String[] args) {

		/**
		 * Taking String from user to check palindrome or not
		 */
		System.out.print("Enter string to check Palindrome or not : ");
		String inputString = sc.next();

		/*
		 * reversing a user input string
		 */
		for (int i = inputString.length() - 1; i >= 0; i--) {
			queue.add(inputString.charAt(i));
		}

		String reverseString = "";

		/*
		 * checking user input with reverse string
		 */
		while (!queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
		}
		if (inputString.equals(reverseString))
			System.out.println("The input is a palindrome.");
		else
			System.out.println("The input not a palindrome.");
	}

}
