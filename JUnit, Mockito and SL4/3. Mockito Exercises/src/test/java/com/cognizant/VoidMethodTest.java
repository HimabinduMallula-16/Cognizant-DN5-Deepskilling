package com.cognizant;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class VoidMethodTest {

    @Test
    public void testVoidMethod() {

        // Create Mock
        NotificationService mockService =
                Mockito.mock(NotificationService.class);

        // Stub Void Method
        doNothing().when(mockService)
                .sendNotification("Welcome User");

        // Call Method
        mockService.sendNotification("Welcome User");

        // Verify Interaction
        verify(mockService)
                .sendNotification("Welcome User");

    }

}