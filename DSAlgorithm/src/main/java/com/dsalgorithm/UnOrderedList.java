package com.dsalgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *Read the Text from a file, split it into words and arrange it as Linked List. 
 * 
 */
public class UnOrderedList {

	/**
	 * Node class 
	 * variable String word and next
	 */
	public class Node {
		String word;
		Node next;

		/**
		 * parameterized constructor
		 */
		public Node(String word) {
			this.word = word;
			this.next = null;
		}
	}
	/**
	 * initialize head to null
	 */
	Node head = null;

	/**
	 * Insert the word to file
	 * @param word - word to insert in to the file
	 */
	public void insert(String word) {
		Node node = new Node(word);
		if (head == null) {
			head = node;
		} else {
			Node iterator = head;
			while (iterator.next != null) {
				iterator = iterator.next;
			}
			iterator.next = node;
		}
	}
	
	/**
	 * Check the word if it found then delete else insert the word
	 * @param word - parameter word to check it is present or not
	 */
	public void checkWord(String word) {
		if (search(word)) {
			System.out.println(" Found the word: " + word);
			delete(word);
		}
		else {
			System.out.println(" Did not find the word, so now inserting " + word);
			insert(word);
		}
	}
	
	/**
	 * Delete the word
	 * @param word
	 */
	public void delete(String word) {
		if (head == null) {
			System.out.println(" Cannot delete from an empty list!");
			return;
		}
		
		Node iterator = head; 
		Node prevIterator = head;
		while(iterator != null) {
			if(iterator.word.equals(word)) {
				prevIterator.next = iterator.next;
				break;
			}
			prevIterator = iterator;
			iterator = iterator.next;
		}
		System.out.println(" Deleted \"" + word + "\"");
	}
	
	/**
	 * Take the user input and search the word 
	 * @param word - word to search
	 */
	public boolean search(String word) {
		Node iterator = head;
		while(iterator != null) {
			if(word.equals(iterator.word))
				return true;
			iterator = iterator.next;
		}
		
		return false;
	}
	
	/**
	 * display the word
	 */
	public void display() {
		Node iterator = head;
		System.out.println();
		while(iterator != null) {
			System.out.print(" " + iterator.word);
			iterator = iterator.next;
		}
	}
	
	/**
	 * Write to the file
	 */
	public void writeToFile() {
		try {
			FileWriter fileWriter = new FileWriter("src/outputUnOrderedList.txt");
			Node iterator = head;
			while(iterator != null) {
				fileWriter.write(" " + iterator.word);
				iterator = iterator.next;
			}
			fileWriter.close();
		} catch (IOException e) {
			System.out.println(" File could not be created with the output");
		}
	}

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UnOrderedList list = new UnOrderedList();
		String str = "";
		int ch;
		try {
			Scanner scanFile = new Scanner(new File("src/input.txt"));
			str = scanFile.nextLine();
		} catch (FileNotFoundException e) {
			System.out.println(" The file was not found!");
		}

		for (String words : str.split(" ")) {
			list.insert(words);
		}
		list.display();

		while (true) {
			System.out.println("\n 1. Search word\n "
								+ "2. Display list\n "
								+ "3. Exit");

			System.out.print(" Please enter your choice: ");
			ch = scan.nextInt();

			switch (ch) {
			case 1:
				System.out.print(" Please enter the word you want to search for: ");
				String word = scan.next();
				list.checkWord(word);
				break;
			case 2:
				list.display();
				break;
			case 3:
				list.writeToFile();
				scan.close();
				return;
			default:
				System.out.println(" close");
				break;
			}
		}

	}
}