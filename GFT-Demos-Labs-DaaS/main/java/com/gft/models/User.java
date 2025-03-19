package com.gft.models;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {

	private String names;
	private String surnames;
	private Date birthday;
	private String gender;
	private Identification id;
	private Address address;

	public User(String names, String surnames, Date birthday, String gender, Identification id, Address address) {
		super();
		this.names = names;
		this.surnames = surnames;
		this.birthday = birthday;
		this.gender = gender;
		this.id = id;
		this.address = address;
	}

	public User() {
		super();
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Identification getId() {
		return id;
	}

	public void setId(Identification id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
