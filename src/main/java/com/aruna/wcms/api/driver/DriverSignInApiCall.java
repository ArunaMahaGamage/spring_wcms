package com.aruna.wcms.api.administrator;

import com.aruna.wcms.administratorSignIn.model.AdministratorSignIn;
import com.aruna.wcms.citizenSignIn.model.CitizenSignIn;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class AdministratorSignInApiCall {

    private final RestClient restClient;

    public AdministratorSignInApiCall() {
        RestClient.Builder builder = RestClient.builder();
        // Base URL can be configured here or passed in uri()
        this.restClient = builder.baseUrl("http://localhost:8080").build();
    }

    public AdministratorSignIn callApiAdministratorSignIn(AdministratorSignIn citizenSignIn) {
        AdministratorSignIn response = restClient.post()
                .uri("/api/administrator-sign-in/create-administrator-sign-in")
                .contentType(MediaType.APPLICATION_JSON)
                .body(citizenSignIn) // Spring automatically converts the object to JSON
                .retrieve()
                .body(AdministratorSignIn.class); // Receives the response as a String

        System.out.println("API Response: " + response);
        return response;
    }
}
