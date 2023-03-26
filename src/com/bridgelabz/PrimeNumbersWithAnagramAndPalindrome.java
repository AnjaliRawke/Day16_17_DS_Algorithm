package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbersWithAnagramAndPalindrome {
	public static void main(String[] args) {

		int rangeStart = 0;
		int rangeEnd = 1000;

		List<Integer> primeNumbers = new ArrayList<>();

		for (int i = rangeStart; i <= rangeEnd; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}

		System.out.println("Prime numbers between " + rangeStart + " and " + rangeEnd + " that are also anagrams and palindromes are:");

		for (int prime : primeNumbers) {
			if (isAnagram(prime) && isPalindrome(prime)) {
				System.out.print(prime + " ");
			}
		}
	}

	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isAnagram(int num) {
		String str1 = Integer.toString(num);
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		String str2 = "";
		for (char c : arr1) {
			str2 += c;
		}
		int num2 = Integer.parseInt(str2);
		return (num == num2);
	}

	private static boolean isPalindrome(int num) {
		String str = Integer.toString(num);
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
