package javaprograms;

import java.util.HashMap;

public class isomorphic {

	public static void main(String[] args) {
		
		String s1 = "paper";
        String s2 = "title";
        boolean flag = false;
        HashMap<Character,Character> i1 = new HashMap<Character,Character>();
        HashMap<Character,Character> i2 = new HashMap<Character,Character>();
        
        if(s1.length()==s2.length()){
            for(int i=0; i<s1.length();i++){
                i1.put(s1.charAt(i),s2.charAt(i));
                i2.put(s2.charAt(i),s1.charAt(i));
            }
            System.out.println(i1);
            System.out.println(i2);
            for(char key : i1.keySet()) {
            	if(i2.get(i1.get(key)) == key) {
            		flag = true;
            	}
            }
        }
        
        System.out.println(flag);
        
        

	}

}
