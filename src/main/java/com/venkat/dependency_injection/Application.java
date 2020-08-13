package com.venkat.dependency_injection;

import javax.inject.Inject;

public class Application {

	private MessageService service;
	
	/*@com.google.inject.Inject
	public Application(MessageService service) {
		this.service=service;
	}*/
	
	//setter method injector
	@Inject
	public void setService(MessageService service) {
		this.service = service;
	}

	public boolean sendMessage(String msg, String receipient) {
		return service.sendMessage(msg, receipient);
	}

}
