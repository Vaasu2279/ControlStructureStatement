package com.control_statements;

import java.util.Scanner;

public class Perfect_number {
	
	//perfect number is a number sum of divisors is equal to the same number 
	//6=2+3
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("enter the number");
		int digit = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= digit / 2; i++) {
			if (digit % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == digit) {
			System.out.println("perfect number");
		} else {
			System.out.println("its not a perfect");
		}

		Perfect_number p = new Perfect_number ();
		p.perfect();
	}
	
	void perfect() {
		

		System.out.println("enter the range start");
		int start = sc.nextInt();
		System.out.println("enter the range end");
		int end= sc.nextInt();
		for(int i = start; i<=end;i++) {
			int sum =0;
			for(int j=1;j<=i/2;j++) {
				
				if(i%j==0) {
					sum= sum+j;
				}
			}
			  if(sum==i) {
				System.out.println(i);
			}	
		}		
	}
}
