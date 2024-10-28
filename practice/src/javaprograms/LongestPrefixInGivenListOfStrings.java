package javaprograms;

public class LongestPrefixInGivenListOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"flower", "flow", "floght"};
		String prefix = "";
		String shortest = "";
		boolean isCommon = true;
		int shortestLength = strs[0].length();
		
		for(String str : strs) {
			if(str.length()<shortestLength) {
				shortest=str;
			}
		}
		
		for(int i=0;i<shortest.length();i++) {
			char c = shortest.charAt(i);
			for(int j=0; j< strs.length;j++) {
				if(c!=strs[j].charAt(i)) {
					isCommon = false;
					break;
				}
			}
			if(isCommon) {
				prefix = prefix + c;
			}else {
				break;
			}
			
		}
		
		System.out.println(prefix);

	}

}
