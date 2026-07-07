package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MultipleReturnTest {

    @Test
    public void testMultipleReturns() {

        // Create Mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub with multiple return values
        when(mockApi.getData())
                .thenReturn("First Call")
                .thenReturn("Second Call")
                .thenReturn("Third Call");

        // Create Service
        MyService service = new MyService(mockApi);

        // First Call
        assertEquals("First Call", service.fetchData());

        // Second Call
        assertEquals("Second Call", service.fetchData());

        // Third Call
        assertEquals("Third Call", service.fetchData());

    }

}