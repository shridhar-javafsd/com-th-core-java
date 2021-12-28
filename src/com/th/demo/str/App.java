package com.th.demo.str;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 45000));
		empList.add(new Employee(102, "Monu", 40000));
		empList.add(new Employee(103, "Tonu", 50000));
		empList.add(new Employee(104, "Ponu", 55000));
		empList.add(new Employee(105, "Gonu", 35000));

		System.out.println(empList);

		System.out.println("iterate with iterator");
		Iterator<Employee> empIt = empList.iterator();
		while (empIt.hasNext()) {
			System.out.println(empIt.next().toString());
		}

		System.out.println("iterate with forEach() with lambda"); // () -> {}

		empList.forEach((emp) -> {
			System.out.println(emp.toString());
		});

		// Java Stream API

		Stream<Employee> empStream = empList.stream();
//		empStream.

	}

}


