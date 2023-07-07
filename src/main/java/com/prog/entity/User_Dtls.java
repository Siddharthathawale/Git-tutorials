package com.prog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User_Dtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String designation;
	private String age;
	private String place;

	public User_Dtls(int id, String name, String designation, String age, String place) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.place = place;
	}

	public User_Dtls() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "User_Dtls [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + ", place="
				+ place + "]";
	}

}
