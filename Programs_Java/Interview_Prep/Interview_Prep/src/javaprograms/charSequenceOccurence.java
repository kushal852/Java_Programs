package javaprograms;

import java.util.ArrayList;
import java.util.HashMap;

public class charSequenceOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "Kushal is preparing a Test for automation testing";

        // List of substrings to check
        String[] substrings = {"Te", "st", "Tes", "Test", "est", "es"};
        
        // Store occurrences of each substring in a HashMap
        HashMap<String, ArrayList<Integer>> substringIndexes = new HashMap<>();

        for (String sub : substrings) {
            ArrayList<Integer> indexes = new ArrayList<>();
            int index = original.indexOf(sub);
            
            // Loop to find all occurrences of the substring
            while (index >= 0) {
                indexes.add(index);
                index = original.indexOf(sub, index + 1);  // Find next occurrence
            }
            
            // Add the indexes to the HashMap for the substring
            substringIndexes.put(sub, indexes);
        }

        // Print the results
        for (String sub : substrings) {
            if (!substringIndexes.get(sub).isEmpty()) {
                System.out.println("Substring '" + sub + "' found at indexes: " + substringIndexes.get(sub));
            } else {
                System.out.println("Substring '" + sub + "' not found.");
            }
        }

	}

}
