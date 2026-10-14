package com.control_statements;
import java.util.Scanner;

public class Switch_1 {

	static int price;
	static int age;
	static int sum;
	
	public static void main(String[] args) {
		
		String yn = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("types of ticket pricess:");
		System.out.println("1.silver   = 200");
		System.out.println("2.gold     = 300");
		System.out.println("3.platinum = 500");
		
		do{
		System.out.println("enter your choice");
		int choice = sc.nextInt();
		
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		switch(choice) {
		
		case 1 :
			int x = 200;
			if (age >= 60) {
				price = x/100*10;
				sum = x-price;
				System.out.println("your ticket price is :"+sum);
			}
			else {
				System.out.println("yout ticket price is :"+x);
			}
			break;
			
		case 2 :
			int y = 300;
			if (age >= 60) {
				price = y/100*10;
				sum = y-price;
				System.out.println("your ticket price is :"+sum);
			}
			else {
				System.out.println("your ticker price is :"+y);
			}
			break;
		case 3:
			int z =500;
			if (age >= 60) {
				price = z/100*10;
				sum = z-price;
				System.out.println("your ticket price is :"+sum);
			}
			else {
				System.out.println("your ticker price is :"+z);
			}
			break;
		default :
			System.out.println("exit");
		
		}
		System.out.println("do you want to continue for continue type yes ");
		
		yn=sc.next();

		}while(yn.equalsIgnoreCase("yes"));
}
	
}
