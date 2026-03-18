package com.aruna.wcms.api;

import org.springframework.web.client.RestClient;

public class BaseRestClient {

    public RestClient.Builder restClientBuilder() {
        RestClient.Builder builder = RestClient.builder();
        return builder;
    }
}
