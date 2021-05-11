package com.java;

public class AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number = new int[]{20,30,25,35,-16,60,-100};
		
		//calculate sum of all array element
		
		int sum = 0;
		for(int i = 0; i<number.length; i++ )
			sum = sum + number[i];
		//calculate average value
		
		double average = sum/number.length;
		System.out.println("Average value of the array elements is :"+ average);
	}

}
