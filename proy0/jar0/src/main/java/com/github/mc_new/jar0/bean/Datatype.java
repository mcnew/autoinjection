package com.github.mc_new.jar0.bean;

public class Datatype {

	private boolean required;

	private String name;

	private String country;

	public Datatype(boolean required, String name, String country) {
		this.required = required;
		this.name = name;
		this.country = country;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
