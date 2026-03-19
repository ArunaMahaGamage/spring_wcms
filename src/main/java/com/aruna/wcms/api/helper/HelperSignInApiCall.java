package com.aruna.wcms.api.helper;

import com.aruna.wcms.helperSignIn.model.HelperSignIn;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class HelperSignInApiCall {

    private final RestClient restClient;

    public HelperSignInApiCall() {
        RestClient.Builder builder = RestClient.builder();
        // Base URL can be configured here or passed in uri()
        this.restClient = builder.baseUrl("http://localhost:8080").build();
    }

    public HelperSignIn callApiCreateHelperSignIn(HelperSignIn helperSignIn) {
        HelperSignIn response = restClient.post()
                .uri("/api/helper-sign-in/create")
                .contentType(MediaType.APPLICATION_JSON)
                .body(helperSignIn) // Spring automatically converts the object to JSON
                .retrieve()
                .body(HelperSignIn.class); // Receives the response as a String

        System.out.println("API Response: " + response);
        return response;
    }
}
