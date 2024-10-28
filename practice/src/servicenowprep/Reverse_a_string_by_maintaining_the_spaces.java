package servicenowprep;

import java.util.ArrayList;

public class Reverse_a_string_by_maintaining_the_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am a Tester";
		ArrayList<Integer> spaceIndexes = new ArrayList<Integer>();
		String output = "";
		
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				spaceIndexes.add(i);
			}
		}
		
		System.out.println(spaceIndexes);
		
		for(int i=s.length()-1;i>=0;i--) {
			output += s.charAt(i);
		}
		
		output = output.replaceAll(" ", "");
		System.out.println(output);
		
	
        StringBuilder sb = new StringBuilder(output);
        
        for (int index : spaceIndexes) {
            sb.insert(index, " ");
        }
        
        System.out.println(sb.toString());
		
        
	}

}
