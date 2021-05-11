package com.java;
import java.util.Scanner;
public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner("System.in");
		System.out.println("Enter any two number to check equality :");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		if(num1==num2) {
			System.out.println("The two number are equal");
			}
		else if(num1!=num2)
		{
			System.out.println("The number are not equal");
		}
	}

}
