package com.aruna.wcms.api.citizen;

import com.aruna.wcms.citizenSignIn.model.CitizenSignIn;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class CitizenSignUpApiCall {
    public void callApiCitizenSignIn(CitizenSignIn citizenSignIn) {
        String url = "http://localhost:8080/api/citizen-sign-in/create-citizen-sign-in";
        RestTemplate restTemplate = new RestTemplate();

        // 1. Set Headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // 2. Raw JSON string
        String rawJson = "{\"name\":\"John\", \"age\":30}";

        // 3. Create Entity
        HttpEntity<String> request = new HttpEntity<>(rawJson, headers);

        // 4. Send Request
        String response = restTemplate.postForObject(url, request, String.class);
        System.out.println(response);
    }
}
