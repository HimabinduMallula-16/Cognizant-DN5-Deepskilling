package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class NetworkServiceTest {

    @Test
    public void testServiceWithMockNetworkClient() {

        // Create Mock Network Client
        NetworkClient mockNetworkClient = mock(NetworkClient.class);

        // Stub connect() Method
        when(mockNetworkClient.connect())
                .thenReturn("Mock Connection");

        // Create Service
        NetworkService networkService =
                new NetworkService(mockNetworkClient);

        // Call Service
        String result =
                networkService.connectToServer();

        // Verify Output
        assertEquals("Connected to Mock Connection", result);

        // Verify Method Call
        verify(mockNetworkClient).connect();

    }

}