package com.bridgelabz;

public class PrimeNumbersInRange {
	public static void main(String[] args) {

		int rangeStart = 0;
		int rangeEnd = 1000;

		System.out.println("Prime numbers between " + rangeStart + " and " + rangeEnd + " are:");

		for (int i = rangeStart; i <= rangeEnd; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
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
}
