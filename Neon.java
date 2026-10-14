package com.control_statements;
import java.util.*;

public class Neon {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int neon = n*n;
		int sum =0;
		
		for(int i = neon; i>0;i= i/10) {
			
				int digit = i%10;
				sum += digit;
					
		}
		
		if(sum==n) {
			System.out.println("it is a neon number");
		}
		else {
			System.out.println("it is not a neon number");
		}
		
		
		
	}

}
