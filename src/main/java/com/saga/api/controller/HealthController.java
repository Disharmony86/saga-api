package com.saga.api.controller;

import com.saga.api.model.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {



    @GetMapping("/api/health")
    public HealthResponse health() {
        return new HealthResponse("OK", "1.0.0");
    }

}
