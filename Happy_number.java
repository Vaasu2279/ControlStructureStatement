package com.control_statements;

import java.util.*;

public class Happy_number {

//	A Happy Number is a number where the repeated sum of the squares of its digits eventually becomes 1.
	//Input - 19 =>1² + 9² = 82
	//         8² + 2² = 68
	 //        6² + 8² = 100
	//         1² + 0² + 0² = 1
	//Output - Happy Number
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the digit ");
		int digit = sc.nextInt();
		int temp= digit ;
		int r =0;
			
			while(temp>9) {
				int sum=0;
				while(temp>0){
					
					 r = temp%10;
					 sum = sum+r*r;
					 temp = temp/10;
				}
				
				temp =sum;
			}
		
			if(temp==1) {
				System.out.println("its a happy number ");
			}
			else {
				System.out.println("its not a happy number");
			}
	}

}
