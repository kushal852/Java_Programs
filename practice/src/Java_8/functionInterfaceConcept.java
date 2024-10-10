package Java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class functionInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Interface function will have two params T - type of input and R - Type of result
		 * Function will consist of one abstract method apply
		 */
		
		Function<String, Integer> func = x -> x.length();
		
		System.out.println(func.apply("Kushal"));
		
		Function<Integer, Integer> func1 = x -> x*2;
		
		func.andThen(func1).apply("Kushal");
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> evenNumbers = numbers.stream().filter(num -> (num%2==0)).toList();
		System.out.println(evenNumbers);
	}

}
