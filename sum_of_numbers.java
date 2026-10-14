package com.control_statements;

import java.util.Scanner;

public class sum_of_numbers {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int sum =0;
		
		for(int i =0;i<=n;i++) {
			
			sum = sum +i;
			System.out.print(sum+" ");
			
		}
		
		System.out.println(" ");
		sum_of_numbers  v = new sum_of_numbers();
		v.sum();
		v.even();
		
		
	}
	
	void sum() {
		
		System.out.println("enter the number:");
		int n = sc.nextInt();
		
		int sum = n*(n+1)/2;
		System.out.println(sum);
		
	}
	
	void even() {
		
		System.out.println("enter the number ");
		int n = sc.nextInt();
		
		for(int i =1;i<n;i++) {
			
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			
		}
	}
	

}
