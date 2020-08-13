package com.venkat.annotationsbased.configuration;

import info.macias.kaconf.Property;

public class DbManager {

	@Property("db.username")
	private String user;

	@Property("db.password")
	private String password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
