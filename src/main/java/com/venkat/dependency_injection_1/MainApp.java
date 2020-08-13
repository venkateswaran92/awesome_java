package com.venkat.dependency_injection_1;

//https://github.com/vanillasource/jaywire

public class MainApp {
	public static void main(String[] args) {

		AppModule module = new AppModule();
		module.getService();
		module.getConnection();

	}
}
