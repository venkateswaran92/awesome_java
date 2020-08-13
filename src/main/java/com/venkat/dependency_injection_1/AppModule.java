package com.venkat.dependency_injection_1;

import com.vanillasource.jaywire.standalone.StandaloneModule;

public class AppModule extends StandaloneModule {

	// example-1
	public Service getService() {
		return singleton(() -> new Service());
	}

	// example-2
	public DataBase getConnection() {
		return singleton(() -> new MysqlConnection());
	}

}