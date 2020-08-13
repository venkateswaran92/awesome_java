package com.venkat.annotationsbased.configuration;

import info.macias.kaconf.Property;

public class Constants {

	@Property("timeout")
	public static final long TIMEOUT_MS = 1000;

	@Property("security.enabled")
	public static final boolean SECURITY_ENABLED = false;

	public static long getTimeoutMs() {
		return TIMEOUT_MS;
	}

	public static boolean isSecurityEnabled() {
		return SECURITY_ENABLED;
	}
}
