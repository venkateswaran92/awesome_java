package com.venkat.interfaceBased.configuration;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ "file:ServerConfig.properties"})
public interface ServerConfig extends Config {

	int port();

	String hostname();

	@DefaultValue("42")
	int maxThreads();
}
