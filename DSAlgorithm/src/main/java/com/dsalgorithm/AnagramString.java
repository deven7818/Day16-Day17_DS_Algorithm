package com.dsalgorithm;

import java.util.Arrays;

/**
 * Program to check given Strings are anagram or not
 */
public class AnagramString {

	public static void main(String[] args) {

		/**
		 * Take two String 
		 */
		String x = "abcd";
		String y = "dcba";
		/**
		 * Replace string
		 */
		x = x.replace(" ", " ");
		y = y.replace(" ", " ");

		/**
		 * Convert the string to lover case
		 */
		x = x.toLowerCase();
		y = y.toLowerCase();
		
		/**
		 * Store the string into character array
		 */
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		/**
		 * Sorting the string array using Array.sort() Method
		 */
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result = Arrays.equals(a, b);
		
		/**
		 * if both string matches the characters then the strings are anagram 
		 */
		if(result == true) {
			System.out.println("Strings are Anagram");
		}
		/**
		 *else the strings are not anagram 
		 */
		else {
			System.out.println("Strings are not Anagram");
		}
	}

}
