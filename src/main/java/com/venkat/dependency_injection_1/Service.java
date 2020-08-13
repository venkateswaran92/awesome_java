package com.venkat.dependency_injection_1;

public class Service {
	private String name;

	Service() {
		System.out.println("service object created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
