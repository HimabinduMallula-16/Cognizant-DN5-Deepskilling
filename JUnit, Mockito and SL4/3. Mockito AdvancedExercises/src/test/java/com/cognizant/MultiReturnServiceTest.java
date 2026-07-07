package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MultiReturnServiceTest {

    @Test
    public void testServiceWithMultipleReturnValues() {

        // Create Mock Repository
        Repository mockRepository = mock(Repository.class);

        // Stub Multiple Return Values
        when(mockRepository.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        // Create Service
        Service service = new Service(mockRepository);

        // First Call
        String firstResult = service.processData();

        // Second Call
        String secondResult = service.processData();

        // Verify Results
        assertEquals("Processed First Mock Data", firstResult);

        assertEquals("Processed Second Mock Data", secondResult);

        // Verify Method Called Twice
        verify(mockRepository, times(2)).getData();

    }

}