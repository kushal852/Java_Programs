package javaprograms;

public class Find_number_of_groups_of_consecutive_characters_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "geekksforgggeekss";
		int count = 1;
		char prev = s.charAt(0);
		
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) == prev) {
				count = count+1;
			}else {
				if(count>1) {
					System.out.println(prev + ":" +count);
				}
				count = 1;
			}
			prev = s.charAt(i);
		};	
		if(count>1) {
			System.out.println(prev + ":" +count);
		}
	}

}
