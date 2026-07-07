package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    public void testServiceWithMockRepository() {

        // Create Mock Repository
        Repository mockRepository = mock(Repository.class);

        // Stub Method
        when(mockRepository.getData())
                .thenReturn("Mock Data");

        // Create Service
        Service service = new Service(mockRepository);

        // Call Method
        String result = service.processData();

        // Verify Result
        assertEquals("Processed Mock Data", result);

    }

}