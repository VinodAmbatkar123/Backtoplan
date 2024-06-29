package com.vinod.polymorphism;

public class A {

	public void show(char ch) {
			System.out.println("this is cahracter"+ch);
		}

	public void show(int a) {
System.out.println("this is the number"+a);
}
	
	public static void main(String[] args) {
		A a=new A();
		a.show('A');
		a.show(45);
	}
}