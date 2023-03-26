package com.bridgelabz.DataStructureProblems.OrderedLinkedList;

import java.util.Scanner;

	public class LinkedListMain<T> {
		static String str = "Hello this is shubham. ";

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<>();
			System.out.println("How many number do you want to add: ");
			int number = sc.nextInt();
			for (int i = 0; i < number; i++) {
				System.out.println("Enter a number which you want to add to the linkedList");
				int a = sc.nextInt();
				sortedLinkedList.add(a);
			}
			System.out.println("Original linked list");
			sortedLinkedList.display();
			System.out.println();
			System.out.println("Sorted linked list");
			sortedLinkedList.sort();
			sortedLinkedList.display();
			while (true) {
				System.out.println();
				System.out.print("Enter a number to check weather it is present or not:-");
				int n = sc.nextInt();
				sortedLinkedList.search(n);
				System.out.println("Updated linked list");
				sortedLinkedList.display();
			}
		}
	}

