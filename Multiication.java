package com.control_statements;
import java.util.*;

public class Multiication {

	public static void main(String[] args) {
		
		int mul =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		
		for(int i =1; i<=10; i++) {
			
			mul = i*n;
			System.out.println(n+"*"+i+"="+mul);
		}
	}
}

