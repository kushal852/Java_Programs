package javaprograms;

public class count_Of_unique_Character_with_Insertion_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "aabbbccccaaaaa";
		//StringBuilder result = new StringBuilder();
		String result = "";
        int count = 1;
        
        // Iterate through the string starting from the second character
        for (int i = 1; i < input.length(); i++) {
            // If the current character is the same as the previous one, increment the count
            if (input.charAt(i) == input.charAt(i - 1)) {
                count = count+1;
            } else {
                // Append the previous character and its count to the result
                //result.append(input.charAt(i - 1)).append(count);
            	result = result + input.charAt(i - 1) + count;
                count = 1;
            }
        }
        
        // Append the last character and its count
        //result.append(input.charAt(input.length() - 1)).append(count);
        result = result + input.charAt(input.length() - 1) + count;
        
        System.out.println(result);

	}

}
