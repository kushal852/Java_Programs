package servicenowprep;

import java.util.HashSet;
import java.util.Set;

public class PermutationsAndCombinations {

		
	 public static void findPermutations(String str, String result) {
	        // If the string is empty, print the result
	        if (str.length() == 0) {
	            System.out.println(result);
	            return;
	        }

	        // Loop through each character and generate permutations
	        for (int i = 0; i < str.length(); i++) {
	            // Remove the i-th character and find permutations of the remaining string
	            char ch = str.charAt(i);
	            String remaining = str.substring(0, i) + str.substring(i + 1);
	            findPermutations(remaining, result + ch);
	        }
	    }

	    // Method to print all combinations of the string
	    public static void findCombinations(String str, String result, int index) {
	        // Print the result if it's not empty (to exclude the empty combination)
	        if (!result.isEmpty()) {
	            System.out.println(result);
	        }

	        // Loop through the rest of the characters to find combinations
	        for (int i = index; i < str.length(); i++) {
	            findCombinations(str, result + str.charAt(i), i + 1);
	        }
	    }

	    public static void main(String[] args) {
	        String str = "abc";
	        System.out.println("Permutations of the string:");
	        findPermutations(str, "");

	        System.out.println("\nCombinations of the string:");
	        findCombinations(str, "", 0);
	    }


}
