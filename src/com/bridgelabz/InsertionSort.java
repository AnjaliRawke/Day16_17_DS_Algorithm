package com.bridgelabz;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of words: ");
		int n = scanner.nextInt();
		scanner.nextLine(); // consume the newline character

		String[] words = new String[n];
		System.out.println("Enter the words:");
		for (int i = 0; i < n; i++) {
			words[i] = scanner.nextLine();
		}

		insertionSort(words);

		System.out.println("Sorted words:");
		for (String word : words) {
			System.out.println(word);
		}
	}

	private static void insertionSort(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
