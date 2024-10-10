package javaprograms;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Kushal is Preparing Java";
		int wordCount = 0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)== ' ' && a.charAt(i+1) != ' ') {
				wordCount++;
			}
		}
		System.out.println(wordCount+1);
		
		String[] strArr = a.split(" ");
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i].charAt(0));
		}
	}

}
