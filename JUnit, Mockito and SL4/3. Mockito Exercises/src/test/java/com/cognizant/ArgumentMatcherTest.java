package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ArgumentMatcherTest {

    @Test
    public void testArgumentMatching() {

        // Create Mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub using any integer
        when(mockApi.getDataById(anyInt()))
                .thenReturn("User Found");

        // Create Service
        MyService service = new MyService(mockApi);

        // Call Method
        String result = service.fetchDataById(101);

        // Verify Output
        assertEquals("User Found", result);

        // Verify Method Called
        verify(mockApi).getDataById(anyInt());

    }

}