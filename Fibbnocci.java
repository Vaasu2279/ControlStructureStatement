package com.control_statements;

import java.util.Scanner;

public class Fibbnocci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number how many number you want :");
		int n = sc.nextInt();
		fibbnocci(n);
		
	}
	
	static int fibbnocci(int n) {
		
		int n1 =0;
		int n2 =1;
		int n3 = 0;
		
		for(int i=0;i<n-2;i++) {
			
			n3 = n1+n2;
			System.out.print(n1+n2+n3+" ");
			n1=n2;
			n2=n3;
			
		}
			
		
		return n;
	}

}
