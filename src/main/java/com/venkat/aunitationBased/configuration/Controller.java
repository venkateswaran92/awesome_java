package com.venkat.aunitationBased.configuration;

import info.macias.kaconf.Configurator;
import info.macias.kaconf.ConfiguratorBuilder;
import info.macias.kaconf.sources.JavaUtilPropertySource;

//https://github.com/mariomac/kaconf

public class Controller {

	static DbManager dbm = new DbManager();

	public void start() {

		Configurator conf = new ConfiguratorBuilder()
				.addSource(JavaUtilPropertySource
						.from("app.properties"))
				.build();
		conf.configure(dbm);
		conf.configure(Constants.class);
	}

	// testing
	public static void main(String args[]) {
		new Controller().start();

		System.out.println(dbm.getUser());
		System.out.println(dbm.getPassword());

		System.out.println(Constants.getTimeoutMs());
		System.out.println(Constants.SECURITY_ENABLED);
	}

}
