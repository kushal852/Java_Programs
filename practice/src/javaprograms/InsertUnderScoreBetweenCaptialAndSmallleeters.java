package javaprograms;

public class InsertUnderScoreBetweenCaptialAndSmallleeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "camelCaseStringExample";
		String s1 = "";
		
		for(int i=1; i<s.length();i++) {
			char c = s.charAt(i-1);
			char c1 = s.charAt(i);
			if(Character.isLowerCase(c) && Character.isUpperCase(c1)) {
				s1 = s1 + c + "_";
			}else {
				s1 = s1 +c;
				
			}
		}
		
		s1 = s1 + s.charAt(s.length() - 1);
		
		
		System.out.println(s1);

	}

}
