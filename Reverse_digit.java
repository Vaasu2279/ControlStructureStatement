package com.control_statements;

import java.util.Scanner;

public class Reverse_digit {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your digit ");
		int n = sc.nextInt();
		int r=0;
		
		while(n>0){
			r =r*10+n%10;
			n = n/10;
		}
		
		System.out.println("reverse digit : "+r);
	}

}
