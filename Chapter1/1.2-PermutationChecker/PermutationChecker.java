package org.markmavromatis

// Given 2 strings, find out if one is a permutation of the other
// Input: 2 strings
// Output: Boolean (True/False)
// What if either string is null? False
// What if either string is blank? False
// What if both strings are the same?   Permutation is true
public class PermutationChecker {

	public boolean isPermutation(String permutationString, String fullString) {
		// Initialize to true
		boolean isPermutation = true;

		if (permutationString == null || fullString == null) {
			isPermutation = false;
		}

		if (permutationString == "" || fullString == "") {
			isPermutation = false;
		}

		if (isPermutation) {
			// Iterate over character of full string
			// Check if there is a matching substring that equals the permutation string.
			int permutationStringLength = permutationString.length()
			int fullStringLength = fullString.length()

			for (int i = 0; i < fullStringLength; i++) {

			}
		}

		return isPermutation;	
	}

	public static void main(String[] args) {
		String permutationString = args[0];
		String fullString = args[1];

		


	}

}