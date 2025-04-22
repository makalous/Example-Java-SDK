package org.example.sdk.model;

import lombok.Data;

/**
 * Response DTO returned from the /api/get/example endpoint.
 */
@Data
public class ExampleRspDto {
    private String exampleOne;
    private String exampleTwo;
    private String exampleThree;
}