package com.control_statements;

import java.util.Scanner;

public class Second_Largest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the digit ");
		int digit = sc.nextInt();
		int r=0;
		int highest=0;
		int second=0;
		int third=0;
		
		while(digit>0) {
			
			r = digit%10;
			if(r>highest) {
				third=second;
				second=highest;
				highest=r;
			}
				else if(r>second && r<highest) {
					second=r;
			}
				else if(r>third && r<second) {
					third =r;
				}
			
			digit= digit/10;
		}
			System.out.println("the highest number in digit is :"+highest);
			System.out.println("the second highest number in digit is :"+second);
			System.out.println("the third highest number in digit is :"+third);

	}

}
