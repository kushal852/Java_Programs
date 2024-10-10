package javaprograms;

public class CheckIfNumeric {
	
	static boolean isNumber(CharSequence cs) {
		if(cs == null || cs.length()==0) {
			return false;
		}
		for(int i = 0; i<cs.length(); i++) {
			if(!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CheckIfNumeric.isNumber("1234545"));
		
		// Using Regex
		String a = "kushal852";
		System.out.println((a.replaceAll("[^0-9]", "")).length() == a.length());
	}

}
