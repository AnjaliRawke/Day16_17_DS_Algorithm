package com.bridgelabz.DataStructureProblems;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to check weather it is palindrome or not");
		String string = sc.nextLine();

		Deque<Character> deque = new LinkedList<>();

		// adding each word in dequeue
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			deque.addLast(c);
		}

		boolean flag = true;

		while (deque.size() > 1) {
			char temp1 = deque.removeFirst();
			char temp2 = deque.removeLast();
			if (temp1 != temp2) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(string + " is a palindrome");
		} else {
			System.out.println(string + " is not palindrome");
		}


	}
}
