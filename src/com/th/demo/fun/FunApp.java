package com.th.demo.fun;

public class FunApp implements FunIn {

	public static void main(String[] args) {

		FunApp obj = new FunApp();
		obj.functionalMethod();

	}

	@Override
	public void functionalMethod() {
		System.out.println("functionalMethod implemented");
	}

}
