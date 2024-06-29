package com.vinod.overiding;

public class Testing extends Developer {
	@Override
	public Testing get() {
		System.out.println("this is developers work");
		return this;
	}
}
