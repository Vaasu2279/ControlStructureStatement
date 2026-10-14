package com.control_statements;

import java.util.Scanner;

public class decima_binary {

	public static void main(String[] args) {
	
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number you want convert from decimal to binary");
		int n = sc.nextInt();
		int r =0;
		String binary ="";
		while(n>0) {
			
			r = n%2;
			binary = r+binary;
			n = n/2;
		}
		System.out.println(binary);
		
	}

}
