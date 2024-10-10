package javaprograms;

public class replaceCharsBasedOnCharacterOccurence {
	
	static String specialcharacterGen(String specialChar, int occurence) {
		String charGen = "";
		for(int i=0; i<occurence; i++) {
			charGen += specialChar;
		}
		return charGen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Go to JohO";
		int len = str.length();
		int counter = 0;
		String output = "";
		for(int i=0; i<len; i++) {
			if(str.charAt(i) == 'o') {
				counter += 1;
				output += specialcharacterGen("$", counter);
			}else {
				output += str.charAt(i);
			}	
		}
		System.out.println(output);
		
		// Using String builder
		 StringBuilder sb =new StringBuilder();
		 
		 int count=0;
		 for(int i=0;i<str.length();i++)
		 {
		 if(str.charAt(i)=='o')
		 {
		 count++;
		 sb.repeat('$', count);
		 }
		 else
		 {
		 sb.append(str.charAt(i));
		 }
		 }
		 
		 System.out.println(sb);
	}
}
