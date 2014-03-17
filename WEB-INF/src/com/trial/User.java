package com.trial;

public class User {

	private int id;
	private String name;
	private String contact;

	public User() {
	}

	public User(int i, String name, String contact) {
		this.id = i;
		this.name = name;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void updateContactNumber(String newNumber) {
		contact = newNumber;		
	}

}
