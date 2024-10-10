package javaprograms;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "There are powercuts at my location";
		
		System.out.println(s.charAt(8));
		
		//first occurence of e
		System.out.println(s.indexOf('e'));
		
		//second occurence of e
		System.out.println(s.indexOf('e', s.indexOf('e')+1));
		
		int Second_occurence = s.indexOf('e', s.indexOf('e')+1);
		
		//third occurence of e
		System.out.println(s.indexOf('e', Second_occurence+1));
		
		System.out.println(s.indexOf("kushal")); //-1
		
		//substring
		System.out.println(s.substring(0,9));
		
		//trim, replace, replaceall,split, equals , equalsingnorcase
		
		String a = "kushal";
		String b = "gupta";
		int x = 8;
		int y = 52;
		
		System.out.println(a+b+x+y);//kushalgupta852
		System.out.println(x+y+a+b);//60kushalgupta
		System.out.println(a+b+(x+y));
				
				
		
	}

}
