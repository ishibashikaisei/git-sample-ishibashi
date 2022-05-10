package com.example.domain;

public class Member {
	String name;

	String der;


	int abc;

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

}
