package com.control_statements;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int x = sc.nextInt();

		int sqr = x * x;
		int r = 0;
		String sum = "";
		System.out.println(sqr);

		while (sqr > 0) {

			r = sqr % 10;
			sum = r + sum;
			sqr = sqr / 10;
			if (sum.equals(x + "")) {
				break;
			}

		}

		if (sum.equals(x + "")) {
			System.out.println("its a automorphic number");
		} else {
			System.out.println("its not a automorphic number");
		}
	}

}
