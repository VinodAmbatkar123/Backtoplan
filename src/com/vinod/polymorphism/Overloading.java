package com.vinod.polymorphism;

public class Overloading {
public void operator(int a,int b) {
	System.out.println(a+b);
}
	public void operator(String a,String b)
	{
		System.out.println( a+b);
	}
	
	public static void main(String[] args) {
		Overloading a=new Overloading();
		a.operator(45, 015);
		a.operator("hi" ,"vinod ia m yors");
	}
	
}
