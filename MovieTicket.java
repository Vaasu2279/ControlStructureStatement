package com.vcube;

public class MovieTicket {
	String director ;
	String producer;
	String hero;
	double budget;
	String heroine;
	
	MovieTicket(String director , String producer , String hero,double budget){
		
		this.director = director;
		this.producer = producer;
		this.hero = hero;
		this.budget = budget;
		
		
	}
	
	MovieTicket(MovieTicket m, String heroine){
		this.director = m.director;
		this.producer =m. producer;
		this.hero =m.hero;
		this.budget =m. budget;
		this.heroine= heroine;
	}
	
	public static void main(String[] args) {
		
		MovieTicket m = new MovieTicket("puri","dvv","g",5222202.2);
		m.show();
		MovieTicket m1 = new MovieTicket(m,"shruti");
		m1.show();
		
	}
	
	void show () {
		
	System.out.println("movie directior :" +director);
	System.out.println("movie producer :"+producer);
	System.out.println("movie hero :"+hero);
	System.out.println("movie budget :"+budget);
	System.out.println("movie heroine:"+heroine);
	System.out.println("*******************************");
	
	}

}
