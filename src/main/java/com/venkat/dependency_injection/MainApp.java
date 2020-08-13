package com.venkat.dependency_injection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainApp {

	//https://dagger.dev/dev-guide/
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppInjector());
		Application application = injector.getInstance(Application.class);
		application.sendMessage("hello", "123@gmail.com");
	}

}
