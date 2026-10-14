package com.control_statements;

import java.util.Scanner;

public class Magic_number {
	
	//magic number is sum of digit is equal to 1 
		//1729=19->19=10->10=1

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the digit");
		int digit = sc.nextInt();
		int temp = digit;
		int r=0;
		
		
		while(temp>9) {
			int sum=0;
		while(temp>0) {
			r =temp%10;
			sum= sum+r;
			temp = temp/10;
		 }
			temp = sum;
		
		}
		if(temp==1) {
			System.out.println("its  a magic number");
		}
		else {
			System.out.println("its not a magic number");
		}
	}

}
