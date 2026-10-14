package com.vcube;

public class InstanceObjectCount {

	public static void main(String[] args) {
		
		int count = 0;
		
		InstanceObjectCount co = new InstanceObjectCount();
		
		{
		// TODO Auto-generated method stub
				count ++;
	}
		InstanceObjectCount co0 = new InstanceObjectCount  ();
		InstanceObjectCount co1 = new InstanceObjectCount ();
		InstanceObjectCount co2= new InstanceObjectCount  ();
		InstanceObjectCount co3 = new InstanceObjectCount ();
		InstanceObjectCount co4 = new InstanceObjectCount ();
		
		System.out.println("no.of objects in program  = "+co,co1,co2,co3,co4.count);

	}
}	
