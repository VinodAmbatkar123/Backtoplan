package com.vinod.polymorphism;

public class C {
	public void show(char ch,int a) {
		System.out.println("this is the cahracter"+ch+"this is int"+a);
	}
public void show(int b,char ch) {
	System.out.println("this is string>>" +b+  "<<this is the no"+ch);
}
public static void main(String[] args) {
	C c=new C();
	c.show('A', 50);
	c.show(45, 'B');
}
}
