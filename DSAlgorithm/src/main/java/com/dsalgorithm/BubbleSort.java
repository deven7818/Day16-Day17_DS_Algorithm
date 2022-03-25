package com.dsalgorithm;

public class BubbleSort {
	/**
	 * Method bubbleSort to sort elements
	 * 
	 * @param arr - array of integers to sort using bubble sort
	 */

	static void bubbleSort(int arr[]) {
		int n = arr.length;
		int temp = 0;
		/*
		 * 1. compare element with adjacent 2. if adjacent element is small then swap
		 * the numbers 3. repeat the process for complete array
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - 1); j++) {
				if (arr[j - 1] > arr[j]) {
					// swapping of numbers
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		/*
		 * array of integers
		 */
		int arr[] = { 4, 20, 3, 9, 70, 6, 1, 20 };
		System.out.println("Array Before Bubble sort");
		/*
		 * printing array before sort
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);

		/*
		 * printing array After sort
		 */
		System.out.println("Array After Bubble sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i] + " ");

		}
	}

}
