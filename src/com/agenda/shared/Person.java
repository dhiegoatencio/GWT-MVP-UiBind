package com.agenda.shared;

public class Person {

	private String firstName;
	private String lastname;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFullName() {
		return firstName + " " + lastname;
	}
}
