package com.pratik012;

import java.util.Scanner;

public class Test {

	Employee employee;
	String seniority;

	public Test() {
		this.employee = new Employee();
	}

	public void list() {
		Test test = new Test();
		Scanner input = new Scanner(System.in);
		System.out.println("Personel ismini girin.");
		String name = input.nextLine();
		System.out.println("Personel soyismini girin.");
		String surName = input.nextLine();
		System.out.println("Personel �nvan�n� girin.");
		String job = input.nextLine();
		System.out.println("Personel maa��n� girin.");
		int salary = input.nextInt();

		if (job.equalsIgnoreCase("m�hendis")) {

			if (salary != 0) {
				if (salary >= 10000 && salary <= 17000) {
					seniority = "K�demli M�hendis";
				} else if (salary > 17000) {
					seniority = "Uzman M�hendis";
				} else {
					seniority = "Stajyer";
				}
				Engineer engineer = new Engineer(name, surName, salary);
				System.out.println(engineer);
			} else {
				salary = 10000;
				Engineer engineer = new Engineer(name, surName);
				System.out.println(engineer);
			}
			System.out.println(seniority);

		} else if (job.equalsIgnoreCase("ofis �al��an�")) {

			if (salary != 0) {
				if (salary >= 8000 && salary <= 12000) {
					seniority = "K�demli";
				} else if (salary > 12000) {
					seniority = "Uzman";
				} else {
					seniority = "Stajyer";
				}
				OfficeWorker officeWorker = new OfficeWorker(name, surName, salary);
				System.out.println(officeWorker);
			} else {
				salary = 8000;
				OfficeWorker officeWorker = new OfficeWorker(name, surName);
				System.out.println(officeWorker);
			}
			System.out.println(seniority);
		}

	}

	public static void main(String[] args) {
		Test test = new Test();
		test.list();
	}
}
