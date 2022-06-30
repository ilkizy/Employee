package com.pratik012;

public class Engineer extends Employee {

	public Engineer(String name, String surName, int salary) {
		super(name, surName, salary);

	}

	public Engineer(String name, String surName) {
		super(name, surName);

	}

	@Override
	public String toString() {
		return "Engineer [getJob()=" + getJob() + ", getName()=" + getName() + ", getSurName()=" + getSurName() + ", getSalary()=" + getSalary()
				+ "]";
	}

}
