package javaprograms;

public class LeadingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String source = "00000001024";
		
		for (int i = 0; i < source.length(); i++) {
	        char c = source.charAt(i);
	        if (c != '0') {
	            System.out.println(source.substring(i));
	            break;
	        }
	    }

	}

}
