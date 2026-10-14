package com.control_statements;

import java.util.Random;
import java.util.Scanner;

public class Random_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int x = r.nextInt(10,20);
		int chance = 3;
		
		for(int i=0; i<=chance;i++) {
			System.out.println("enter your your number");
			int y = sc.nextInt();
			if(y==x) {
				System.out.println(" you won");
				System.out.println("your guess is :"+y+" and random number is :"+x);
				break;
			}
			else if(i<chance) {
				System.out.println(" wrong guess try again ");
				System.out.println("you have only "+(chance-i)+" chance left");
				
			}
			else {
				System.out.println("this is your last chance");
				System.out.println("better luck next time and your random number is :"+x);
			}
		}
	}
}