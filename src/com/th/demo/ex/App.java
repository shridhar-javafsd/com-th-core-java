package com.th.demo.ex;

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

		int i = 10, j = 0;

		try {
			System.out.println(i / j);
		} catch (ArithmeticException ae) {
			System.out.println("Do not divide by zero.");
		}

		System.out.println("End");

	}

}
