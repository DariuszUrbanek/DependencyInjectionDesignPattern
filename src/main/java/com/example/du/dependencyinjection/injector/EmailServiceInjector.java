package com.example.du.dependencyinjection.injector;

import com.example.du.dependencyinjection.consumer.MyDIApplication;
import com.example.du.dependencyinjection.consumer.Consumer;
import com.example.du.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
