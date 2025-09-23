package com.saga.api.model;

public class HealthResponse {
    private String status;
    private String version;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    // Constructor
    public HealthResponse(String status, String version) {
        this.status = status;
        this.version = version;
    }

}
