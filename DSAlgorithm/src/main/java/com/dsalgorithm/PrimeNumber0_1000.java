package com.dsalgorithm;

/**
 * Program to find prime numbers in range between 0 to 1000
 */
public class PrimeNumber0_1000 {

	public static void main(String[] args) {
		/**
		 * for loop for iteration till 1000
		 */
		for (int no = 1; no <= 1000; no++) {
			int temp = 0;
			/**
			 * this for loop will check till no -1 length
			 */
			for (int i = 2; i <= no - 1; i++) {
				/**
				 * if no % i == o the it will increment temp value by 1
				 */
				if (no % i == 0) {
					temp = temp + 1;
				}
			}
			/**
			 * if temp value is 0 then it is prime number and print the numbers
			 */
			if (temp == 0) {
				System.out.println(no);

			}
		}

	}

}
