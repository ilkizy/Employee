package com.pratik012;

import java.util.Scanner;

public class Employee {

	private String job;
	private String name;
	private String surName;
	private int salary;

	public Employee(String name, String surName, int salary) {
		super();
		this.name = name;
		this.surName = surName;
		this.salary = salary;
	}

	public Employee(String name, String surName) {
		super();
		this.name = name;
		this.surName = surName;
	}

	public Employee() {

	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void raise() {
		Scanner scanner = new Scanner(System.in);
		int rate = scanner.nextInt();

	}

	@Override
	public String toString() {
		return "Employee [job=" + job + ", name=" + name + ", surName=" + surName + ", salary=" + salary + "]";
	}

}
