package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfSubArrays {
	
	static Integer sumOfNums(List<Integer> nums) {
		int sum = 0;
		if(nums.size()==1) {
			sum = nums.get(0);
		}else {
			for(int i=0; i<nums.size();i++) {
				sum += nums.get(i);
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		List<Integer> arr = Arrays.asList(4, -3, 2, 1, 6, -4, -2, 3, -3);
		List<List<Integer>> subarrs = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		for(int i=0; i<arr.size();i++) {
			for(int j = i+1; j<arr.size()+1;j++) {
				if(sumOfNums(arr.subList(i, j))==0){
					subarrs.add(arr.subList(i, j));
				}
//				 for (int k = i; k <=j; k++) {
//			           temp.add(arr.get(k));
//			      }
//				 if(sumOfNums(temp)==0){
//					 subarrs.add(temp);
//					}
//			temp = new ArrayList<Integer>();
				}
		}
		 
		System.out.println(subarrs);
	}

}
