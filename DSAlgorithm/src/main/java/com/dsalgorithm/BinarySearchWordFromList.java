package com.dsalgorithm;

public class BinarySearchWordFromList {

	/**
	 * Method to search word by Binary Search
	 * 
	 * @param arr  - array of words
	 * @param word - word to find in list
	 * @return returns the result
	 */
	static int binarySearch(String[] arr, String word) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			/*
			 * 1. assign mid to center 2. compare res with mid if res == o then print mid 3.
			 * if res > 0 then assign left to mid + 1 4. else assign right to mid - 1 5.
			 * else return -1 for word not present
			 */
			int mid = left + (right - left) / 2;
			int res = word.compareTo(arr[mid]);
			if (res == 0)
				return mid;
			if (res > 0)
				left = mid + 1;
			else
				right = mid - 1;

		}
		return -1;
	}

	public static void main(String[] args) {
		/*
		 * array of words
		 */
		String[] arr = { "Deven", "Mali", "Dev", "Dhule" };
		/*
		 * word to find
		 */
		String word = "Mali";
		int result = binarySearch(arr, word);
		if (result == -1)
			System.out.println("Word is not present");
		else
			System.out.println("Word Fount at " + "index " + result);

	}

}
