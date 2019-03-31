package com.example.du.dependencyinjection.injector;

import com.example.du.dependencyinjection.consumer.Consumer;

public interface MessageServiceInjector {

	public Consumer getConsumer();
}
