package org.example.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.sdk.model.ExampleRspDto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Client for accessing the Example API.
 */
public class ExampleClient {
    private final static String EP_PATH = "/api/get/example";
    private final HttpClient httpClient = HttpClient.newHttpClient();

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final String baseUrl;

    public ExampleClient(final String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public ExampleRspDto getExample() {
        try {
            final var request = HttpRequest.newBuilder()
                    .uri(URI.create(baseUrl + EP_PATH))
                    .GET()
                    .build();
            final var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                throw new RuntimeException(String.format("API %s returned status: %d",
                        EP_PATH, response.statusCode()));
            }
            return objectMapper.readValue(response.body(), ExampleRspDto.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(String.format("API %s failed: %s",
                    EP_PATH, e.getMessage()));
        }
    }
}
