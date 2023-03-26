package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	//Iterative method
	public static List<String> iterativePermutations(String str) {
		List<String> result = new ArrayList<>();
		result.add(String.valueOf(str.charAt(0)));

		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			List<String> newResult = new ArrayList<>();

			for (String permutation : result) {
				for (int j = 0; j <= permutation.length(); j++) {
					newResult.add(permutation.substring(0, j) + ch + permutation.substring(j));
				}
			}
			result = newResult;
		}
		return result;
	}

	//Recursion Method

	public static List<String> recursivePermutations(String str) {
		List<String> result = new ArrayList<>();
		recursiveHelper("", str, result);
		return result;
	}

	private static void recursiveHelper(String prefix, String suffix, List<String> result) {
		if (suffix.length() == 0) {
			result.add(prefix);
		} else {
			for (int i = 0; i < suffix.length(); i++) {
				recursiveHelper(prefix + suffix.charAt(i),
						suffix.substring(0, i) + suffix.substring(i+1),
						result);
			}
		}
	}

	public static void main(String[] args) {
		String str = "abc";
		List<String> iterativeResult = Permutations.iterativePermutations(str);
		List<String> recursiveResult = Permutations.recursivePermutations(str);
		System.out.println(iterativeResult);
		System.out.println(recursiveResult);
		//System.out.println(Arrays.equals(iterativeResult.toArray(), recursiveResult.toArray()));
	}

}

