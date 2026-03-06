package org.debatium.backend_software_construction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    public record HealthResponse(String status) {}

    @GetMapping("/health")
    public HealthResponse getHealth() {
        return new HealthResponse("ok");
    }
    
}
