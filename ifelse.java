package com.control_statements;
import java.util.*;

public class ifelse {
	

	public static void main(String[] args) {
		
		System.out.println("enter the number :");
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		
		if (v >= 0 && v <=9 ) {
			
			System.out.println("the given number is single digit number ");
		}
		 
		else if ( v >= 10 &&  v <= 99) {
			
			System.out.println("the given number is two digit number ");
		}
		
		else if ( v >= 100 && v<=999){
			
			System.out.println("the given number is three digit number");
		}
		
		else  {
			
			System.out.println("the given number is four digit number or more than four digits");
		}
		
 
	}

}
