package com.example.du.dependencyinjection.injector;

import com.example.du.dependencyinjection.consumer.MyDIApplication;
import com.example.du.dependencyinjection.consumer.Consumer;
import com.example.du.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
