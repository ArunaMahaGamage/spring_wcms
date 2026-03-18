package com.aruna.wcms.api.citizen;

import com.aruna.wcms.citizenSignIn.model.CitizenSignIn;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

/*public class CitizenSignUpApiCall {
    public void callApiCitizenSignIn(CitizenSignIn citizenSignIn) {
        String url = "http://localhost:8080/api/citizen-sign-in/create-citizen-sign-in";
        RestTemplate restTemplate = new RestTemplate();

        // 1. Set Headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);



        // 3. Create Entity
        HttpEntity<String> request = new HttpEntity<>(citizenSignIn, headers);

        // 4. Send Request
        String response = restTemplate.postForObject(url, request, String.class);
        System.out.println(response);
    }
}*/

@Service
public class CitizenSignUpApiCall {

    private final RestClient restClient;

    public CitizenSignUpApiCall() {
        RestClient.Builder builder = RestClient.builder();
        // Base URL can be configured here or passed in uri()
        this.restClient = builder.baseUrl("http://localhost:8080").build();
    }

    public CitizenSignIn callApiCitizenSignIn(CitizenSignIn citizenSignIn) {
        CitizenSignIn response = restClient.post()
                .uri("/api/citizen-sign-in/create-citizen-sign-in")
                .contentType(MediaType.APPLICATION_JSON)
                .body(citizenSignIn) // Spring automatically converts the object to JSON
                .retrieve()
                .body(CitizenSignIn.class); // Receives the response as a String

        System.out.println("API Response: " + response);
        return response;
    }
}
