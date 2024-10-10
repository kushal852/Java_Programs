package Java_8;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebPageInterface w1 = (value) -> {System.out.println(value);};
		WebPageInterface w2 = (value) -> {System.out.println(value.toUpperCase());};
		
		w1.header("google");
		w2.header("naveen");

	}

}
