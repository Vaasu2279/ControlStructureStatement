package com.control_statements;

import java.util.Arrays;
import java.util.Scanner;

public class Example {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//linear_search();
		//sum();
		//binary_search();
		//bubble_sort();
		//selection_sort();
	}
	
	static void linear_search() {
		
		int [] arr = {1,2,3,55,77,6,69,52,41,10,25,74,56,9,89,7,65,25};
		int n = arr.length;
		System.out.println("enter the key number");
		int key = sc.nextInt();
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				int comprassion = i+1;
				System.out.println("the key is found "+arr[i]+" and key is :"+key);
				if(comprassion <=5) {
					System.out.println("this is best case we find the element within the 5 comparssions");
				}
				else if(comprassion >=n-5) {
					System.out.println("this is the wrost case we find the elements n-5 comparssions");
				}
				else {
					System.out.println("this is the average case");
				}
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("the key is not found");
			System.out.println("this is the wrost case we does not find the element we performed n compoarssions");
		}
		
	}

	static void sum () {
		System.out.println("enter the number for sum of numbers: ");
		int n = sc.nextInt();
		int sum1 = n*(n+1)/2;
		System.out.println("the sum of numbers is :"+sum1);
		System.out.println("enter the number for sum of even numbers : ");
		int even = sc.nextInt();
		int sum2 = even*(even +1);
		System.out.println("the sum of even numbers is :"+sum2);
		System.out.println("enter the number for sum of odd numbers ");
		int odd = sc.nextInt();
		int sum3= odd*odd;
		System.out.println("the sum of odd numlbers is :"+sum3);
		
	}

	static void binary_search() {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("enter the number you want to find :");
		int target = sc.nextInt();
		int low =0;
		int high= arr.length-1;
		
		while(low<high) {
			
			int mid = arr.length/2;
			if(arr[mid]== target) {
				System.out.println(arr[mid]);
				System.out.println("its a average case : O(log n)");
				System.out.println("the index is :"+mid);
				break;
			}
			else if(target<arr[mid]) {
				high = mid-1;
				System.out.println("its a best case ");
				low++;
				System.out.println(low);
				break;
			}
			else if(target>arr[mid]) {
				low = mid+1;
				System.out.println("its a wrost case ");
				high++;
				System.out.println(high++);
				break;
			}
			else {
				System.out.println("target is not found :");
			}
			
		}
	}
	
	static void bubble_sort() {
		
		int[] arr = {5,4,3,2,1};
		System.out.println("before sort");
		System.out.println(Arrays.toString(arr));
		int temp =0;
		int inner=0;
		int outer=0;
		
		for(int i=0;i<arr.length;i++) {
			boolean swap = false;
			inner++;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap = true;
					outer++;
				}
				if(!swap) {
					break;
				}
			}
		}
		System.out.println("after sort");
		System.out.println(Arrays.toString(arr));
		System.out.println(inner);
		System.out.println(outer);
	}
	
	static void selection_sort() {
		
		int [] arr = {8,7,3,5,2,6,1};
		int temp=0;
		int inner=0;
		int outer=0;
		
		for(int i=0;i<arr.length;i++){
		  int minindex=i;
		  outer++;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minindex]) {
				minindex = j;	
			}
			   } 
			if(minindex!=i) {
				temp=arr[i];
				arr[i]=arr[minindex];
				arr[minindex]= temp;
				inner++;
		}
			}
		System.out.println(Arrays.toString(arr));
		System.out.println(inner);
		System.out.println(outer);
	}
}
