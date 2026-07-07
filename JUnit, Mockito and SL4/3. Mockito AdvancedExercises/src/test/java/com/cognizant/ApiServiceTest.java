package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class ApiServiceTest {

    @Test
    public void testServiceWithMockRestClient() {

        // Create Mock REST Client
        RestClient mockRestClient = mock(RestClient.class);

        // Stub Method
        when(mockRestClient.getResponse())
                .thenReturn("Mock Response");

        // Create Service
        ApiService apiService = new ApiService(mockRestClient);

        // Call Service Method
        String result = apiService.fetchData();

        // Verify Output
        assertEquals("Fetched Mock Response", result);

    }

}