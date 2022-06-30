package com.pratik012;

public class OfficeWorker extends Employee {

	public OfficeWorker(String name, String surName, int salary) {
		super(name, surName, salary);

	}

	public OfficeWorker(String name, String surName) {
		super(name, surName);

	}

	@Override
	public String toString() {
		return "OfficeWorker [getJob()=" + getJob() + ", getName()=" + getName() + ", getSurName()=" + getSurName() + ", getSalary()=" + getSalary()
				+ "]";
	}
}
