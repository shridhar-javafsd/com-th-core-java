package com.th.demo.fun;

// functional method usage - 1. using implements 
// applicable to any interface and also to functional interface 
//public class FunApp implements FunIn {
//
//	public static void main(String[] args) {
//		FunApp obj = new FunApp();
//		obj.functionalMethod();
//	}
//
//	@Override
//	public void functionalMethod() {
//		System.out.println("functionalMethod implemented");
//	}
//}

//functional method usage - 2. using implements 
//applicable to any interface and also to functional interface 
public class FunApp {

	public static void main(String[] args) {

		FunIn obj = new FunIn() {

			@Override
			public void functionalMethod() {
				System.out.println("functionalMethod implemented");
			}
		};

		obj.functionalMethod();
	}
}
