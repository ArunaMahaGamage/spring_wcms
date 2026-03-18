package com.aruna.wcms.api.driver;

import com.aruna.wcms.administratorSignIn.model.AdministratorSignIn;
import com.aruna.wcms.driverSignIn.model.DriverSignIn;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class DriverSignInApiCall {

    private final RestClient restClient;

    public DriverSignInApiCall() {
        RestClient.Builder builder = RestClient.builder();
        // Base URL can be configured here or passed in uri()
        this.restClient = builder.baseUrl("http://localhost:8080").build();
    }

    public DriverSignIn callApiCreateDriverSignIn(DriverSignIn driverSignIn) {
        DriverSignIn response = restClient.post()
                .uri("/api/driver/addDriver")
                .contentType(MediaType.APPLICATION_JSON)
                .body(driverSignIn) // Spring automatically converts the object to JSON
                .retrieve()
                .body(DriverSignIn.class); // Receives the response as a String

        System.out.println("API Response: " + response);
        return response;
    }
}
