package com.bridgelabz;

public class UseGenerics {
	static <T>void printArray(T[] array){
		for (T x : array) {
			System.out.print(x+" ");
		}
	}
	static  <T> void SearchElement(T search,T[] array){
		for (T a: array) {
			if(a==search){
				System.out.println();
				System.out.println(a+" is present");
			}
		}
	}
	static <T extends Comparable <T>>void SortElement(T[] array) {
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 1; i <array.length; i++) {
				if (array[i-1].compareTo(array[i]) > 0) {
					T temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					flag = true;
				}
			}
		}
	}
	public static void main(String[] args) {
		Integer[] intArray = {1, 4, 5, 6, 7, 3};
		String[] stringarray={"Live","shown","john","Paper","rock","hhh"};
		System.out.println("original array is ");
		printArray(intArray);
		System.out.println();
		printArray(stringarray);
		SortElement(intArray);
		SortElement(stringarray);
		System.out.println();
		System.out.println("Sorted array is");
		printArray(intArray);
		System.out.println();
		printArray(stringarray);
		SearchElement(3,intArray);
		SearchElement("hhh",stringarray);
	}
}
