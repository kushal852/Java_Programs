package javaprograms;

public class Junk_Characters_Removal {

	public static void main(String[] args) {
		
		String s = "读写汉字 - 学中文 Kushal Gupta ?!@#$%^&*() 9994356366";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		String s1= "123-456-789";
		s1 = s1.replaceAll("[^0-9]", "");
		
		System.out.println(s1);
		
		System.out.println("$");

	}

}
