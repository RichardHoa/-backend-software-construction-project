package org.debatium.backend_software_construction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class BackendSoftwareConstructionApplicationTests {

	@Test
	void contextLoads() {
	}

}
