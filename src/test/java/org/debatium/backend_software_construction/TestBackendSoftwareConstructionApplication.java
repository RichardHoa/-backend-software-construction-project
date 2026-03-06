package org.debatium.backend_software_construction;

import org.springframework.boot.SpringApplication;

public class TestBackendSoftwareConstructionApplication {

	public static void main(String[] args) {
		SpringApplication.from(BackendSoftwareConstructionApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
