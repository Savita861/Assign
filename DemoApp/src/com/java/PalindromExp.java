package com.java;
import java.util.Scanner;

public class PalindromExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		
		//input from user
		System.out.println("Enter a string :");
		
		String st = sc.next();		//string function for calculating length of the string
		
		int len = st.length();
		String st1 = "";
		
		for(int i =0; i<len; i++)
		{
			char ch = st.charAt(i);  //string function for getting at a perticular index
			st1 = ch+st1;
		}
		//condition for checking palindrom by using string function
		
		if(st.equals(st1)) 
			
			System.out.println("Palindrom");
			else
			System.out.println("Not Palindrom");
			
			sc.close();
		
		
	}

}
