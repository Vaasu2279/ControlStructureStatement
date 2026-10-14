package com.vcube;

public class Gcnull {
	
	@Override
	protected void finalize  (){
	 	
		System.out.println("object destroted ");
	}
			

	public static void main(String[] args) {
		
		Gcnull safari  = new Gcnull();
		System.out.println(safari);
		
		Gcnull ax = new Gcnull();
		System.out.println(ax);
		
		Gcnull gear = new Gcnull();
		System.out.println(gear);
		
		safari = null;
		ax     = null;
		
		System.out.println("----------------------------");
		
		System.gc();
		
		System.out.println(safari);
		System.out.println(ax);
		System.out.println(gear);
		
	// TODO Auto-generated method stub

	}

}
