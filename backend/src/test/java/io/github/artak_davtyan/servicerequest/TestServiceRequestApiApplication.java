package io.github.artak_davtyan.servicerequest;

import org.springframework.boot.SpringApplication;

public class TestServiceRequestApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(ServiceRequestApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
