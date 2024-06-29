package com.vinod.polymorphism;

public class B {
	public void show(char ch) {
		System.out.println("this is the cahracter"+ch);
	}
public void show(String a,int b) {
	System.out.println("this is string>>" +a+  "<<this is the no"+b);
}
public static void main(String[] args) {
	B b=new B();
	b.show('A');
	b.show("ankush", 45);
}
}
