package servicenowprep;

public class PascalTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 6;
		
		for (int i = 0; i < rows; i++) {
            // Print leading spaces for formatting
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

	}

}