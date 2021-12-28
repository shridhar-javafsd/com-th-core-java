package com.th.demo.str;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
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

		// convert collection to stream
		Stream<Employee> empStream = empList.stream();

		// convert stream to collection
//		List<Employee> empList2 = empStream.collect(Collectors.toList());

		System.out.println("filter emps with higher salaries");
		Stream<Employee> empWithHigherSal = empStream.filter(emp -> emp.getSalary() >= 50000);
		empWithHigherSal.forEach(e -> System.out.println(e.toString()));

		System.out.println("filter emps with higher salaries and return a collection");
		// collection (list) to stream, operations on stream, stream to collection
		List<Employee> empList2 = empList.stream().filter(emp -> emp.getSalary() >= 50000).collect(Collectors.toList());
		
		empList2.forEach((emp) -> {
			System.out.println(emp.toString());
		});

	}

}
