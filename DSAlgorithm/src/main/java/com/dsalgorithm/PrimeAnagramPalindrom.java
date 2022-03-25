package com.dsalgorithm;

import java.util.ArrayList;


/**
 * Extend the previous program to find the prime numbers that are Anagram and Palindrome. 
 * 1. Created two Array list and giving input start range and end range 
 * 2. Created method to check the number is prime or not 
 * 3. Created method to check whether given prime number is Palindrome and Anagram or not. 
 * 4. Created Method to print prime number
 * 
 */

public class PrimeAnagramPalindrom {

	/**
	 * Created a Array list
	 * 1. arrayList for prime numbers 
	 * 2. arrayList2 for prime anagram palindrome numbers
	 */
	static ArrayList<Integer> arrayList = new ArrayList<>();
	static ArrayList<Integer> arrayList2 = new ArrayList<>();

	public static void main(String[] args) {

		/**
		 * Giving input start range 0 and end range 1000
		 */
		final int startRange = 0;
		final int endRange = 1000;

		/**
		 * printing a range
		 */
		primePrint(startRange, endRange);
	}

	/**
	 * created method to check the number is prime or not
	 * 
	 * @param num - Number have to checked
	 * @return- true if prime else false
	 */
	public static boolean isPrime(Integer num) {

		if (num == 0 || num == 1)
			return false;
		for (int i = 2; i <= num; i++) {

			if (num % i == 0) {
				if (i == num) {
					isPalindrome(num);
					if (isPalindrome(num)) {
						arrayList2.add(num);
					}
				} else {
					return false;
				}
			}

		}
		return true;
	}

	/**
	 * Create a isPlaindrom method to check whether the prime no. is palindrome or not
	 * 
	 * @param num - to check the number
	 * @return - true if it is Palindrome
	 */
	public static boolean isPalindrome(Integer num) {
		int r, sum = 0;

		int orn = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (orn == sum) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Method to print prime number
	 * 
	 * @param startRange - 1
	 * 
	 * @param endRange - 1000
	 */
	private static void primePrint(int startRange, int endRange) {
		System.out.println("Prime numbers from  " + startRange + " to " + endRange + " are :");
		for (int range = startRange; range <= endRange; range++) {
			if (isPrime(range)) {
				arrayList.add(range);
			}
		}
		System.out.println(" Prime numbers are : " + arrayList);
		System.out.println("\n Prime Anagram and Palindrome numbers are : " + arrayList2);
	}
}