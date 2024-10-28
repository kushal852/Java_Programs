package servicenowprep;

public class TwoDarrayprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = { { 1, 2, 3, 4, 5 }, 
				  { 6,7,8,9,10 }, 
				  { 11,12,13,14,15 }, 
				  { 16,17,18,19,20 } };
		int rowsCount = a.length;
		
		
		while(rowsCount>=0) {
			if((rowsCount-(a.length))%2==0) {
				for(int j=0;j<a.length;j++) {
					System.out.println(a[j][rowsCount]);
				}
			}else {
				for(int j = a.length-1; j>=0;j--) {
				System.out.println(a[j][rowsCount]);
				}
			}
			
			rowsCount = rowsCount-1;
		}

	}

}
