package com.control_statements;

import java.util.Scanner;

public class Largest_number {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the digit");
		int digit = sc.nextInt();
		int temp = digit;
		int r =0;
		int v=0;
		
		while(temp >0) {
			
			r = temp%10;
			temp =temp/10;
			
			if(r>v) {
				v=r;
			}
		}
		System.out.println(v);
	}

}
