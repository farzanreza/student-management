package com.seleniumexpress.sm.api;

public class StudentDTO {
	
	private String name;
	private long mobile;
	private String country;
	private int id;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getMobile() {
		return mobile;
	}



	public void setMobile(long mobile) {
		this.mobile = mobile;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", mobile=" + mobile + ", country=" + country + "]";
	}
	
	

}
