package com.control_statements;

import java.util.Scanner;

public class Count_digit {

	public static void main(String[] args) {
		
		int count =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers :");
		int digit = sc.nextInt();
		
		for(int i = digit;i>0;i =i/10) {
			count ++;
		}
		System.out.println("the digits are given number is "+count);
	}

}
