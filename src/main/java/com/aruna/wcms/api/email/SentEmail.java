package com.aruna.wcms.api.email;

import com.aruna.wcms.email.model.EmailDetails;
import com.aruna.wcms.email.model.EmailResponse;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

public class SentEmail {

    private final RestClient restClient;

    public SentEmail() {
        RestClient.Builder builder = RestClient.builder();
        // Base URL can be configured here or passed in uri()
        this.restClient = builder.baseUrl("http://localhost:8080").build();
    }

    public EmailResponse callApiEmail(EmailDetails emailDetails) {
        EmailResponse response = restClient.post()
                .uri("/api/email/sendMail")
                .contentType(MediaType.APPLICATION_JSON)
                .body(emailDetails) // Spring automatically converts the object to JSON
                .retrieve()
                .body(EmailResponse.class); // Receives the response as a String

        System.out.println("API Response: " + response);
        return response;
    }

}
