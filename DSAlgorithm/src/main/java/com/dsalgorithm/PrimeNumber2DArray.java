package com.dsalgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Check the number whether prime number or not 
 * 2. Creating object of class
 * 3. Variable Declared start , end , arraySize 
 * 4. Storing 2d array form 
 * 5. Printing prime number in range 
 * 6. Creating age group of 100 to print prime number
 *
 */
public class PrimeNumber2DArray {

	/**
	 * checking whether prime number or not
	 * 
	 * @param number - number to check whether it is prime or not
	 * @return - true if it is prime number
	 */
	public boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * creating object of class
		 */
		PrimeNumber2DArray primeNumber2D = new PrimeNumber2DArray();

		/*
		 * variable declared
		 */
		int start = 0, end = 100, arraySize = 0;
		List<Integer> primeList;
		/*
		 * storing 2d array form
		 */
		Integer[][] primeNumber = new Integer[10][];

		for (int i = 0; i < 10; i++) {
			primeList = new ArrayList<>();
			for (int j = start; j <= end; j++) {
				if (primeNumber2D.isPrime(j)) {
					primeList.add(j);
					arraySize++;
				}
			}
			/*
			 * printing prime number in range
			 */
			primeNumber[i] = primeList.toArray(new Integer[arraySize]);
			System.out.println(primeNumber[i].length);
			for (Integer item : primeNumber[i]) {
				System.out.print(item + "  ");
			}
			System.out.println("\n");
			/*
			 * creating a group of 100 to print prime number
			 */
			start = end + 1;
			end += 100;
			arraySize = 0;
		}
	}
}