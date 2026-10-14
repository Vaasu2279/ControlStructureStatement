package com.control_statements;

import java.util.Scanner;

public class Prime {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number wheather checks the prime number or not :");
		int n = sc.nextInt();
		boolean prime = true;
		
		if(n==0 || n==1) {
			
			prime = false;
			
		}
		for(int i = 2;i<n;i++) {
			
			if(n%i==0) {
				prime = false;
				break;
			}
		}
		
		if(prime) {
			System.out.println("its a prime number");
		}
		else {
			System.out.println("its not a prime number");
		}
		
		Prime p = new Prime();
		p.series_of_prime();
		p.nPrime();
		
	}
	
	void series_of_prime() {
		
		System.out.println("enter the range for prime numbers");
		System.out.println("Enter starting range:");
		int start = sc.nextInt();

		System.out.println("Enter ending range:");
		int end = sc.nextInt();

		System.out.print("Prime numbers between " + start + " and " + end + " are:");

		for (int num = start; num <= end; num++) {

		 if (num <= 1) {
		 continue;
		 }
		 boolean isPrime = true;
		       for (int i = 2; i<= num/2; i++) {
		          if (num % i == 0) {
		               isPrime = false; 
		                 break;           
		             }
		            }
		    if (isPrime) {
		    System.out.print(num + " ");
		}
	  }
	}
	
	    void nPrime() {
		
		System.out.println("");
		System.out.println("enter the number how many prime numbers you wnat");
		int number = sc.nextInt();	
		int count =0;
		int n =2;	
		while(count<number) {
			
			boolean prime = true;
			for(int i= 2;i*i<=n;i++) {
				if(n%i==0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.print(n+" ");
				count++;
			}
			n++;
	  }
	}
  }
