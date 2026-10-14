package com.control_statements;

import java.util.Scanner;

public class practice {
	
	static Scanner sc = new Scanner(System.in);
	
	double salary() {
		
		double sal =0;
		System.out.println("enter your salary");
		sal = sc.nextDouble();
		return sal ;
	}

	public static void main(String[] args) {
	
		 practice p =new  practice();
		 p.salary();

	}

}
