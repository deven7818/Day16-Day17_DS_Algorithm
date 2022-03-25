package com.dsalgorithm;

public class InsertionSort {

	/**
	 * Method insertionSort to Sort the array of string according to lengths. This
	 * method implements Insertion Sort
	 * 
	 * @param arr - array of string
	 * @param n   - no of word
	 */
	static void insertionSort(String arr[], int n) {

		for (int i = 1; i < n; i++) {
			String temp = arr[i];

			int j = i - 1;
			while (j >= 0 && temp.length() < arr[j].length()) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	/*
	 * method to print the sorted array of string
	 */

	static void printList(String str[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(str[i] + " ");
		}
	}

	public static void main(String[] args) {
		/*
		 * array of String to sort
		 */
		String[] arr = { "I", "am", "Deven", "Mali" };
		int n = arr.length;
		insertionSort(arr, n);
		printList(arr, n);
	}

}
