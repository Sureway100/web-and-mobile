package com.example.test;


public class MySimpleMath {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//{1,2,3} =>> 1 + 2 + 3 = 6
		int[] myArrays = {1,2,3,4,5};
		System.out.println( calculateSum(myArrays));

	}
	
	public static int calculateSum(int[] numbers) {
		
//		int[] myArrays = {1,2,3,4,5};
		int total = 0;
		for(int key : numbers) {
			total += key;
		}
		return total;
	}

}
