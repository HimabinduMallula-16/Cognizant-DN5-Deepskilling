package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class VoidExceptionTest {

    @Test
    public void testVoidMethodException() {

        // Create Mock
        NotificationService mockService =
                Mockito.mock(NotificationService.class);

        // Stub Void Method to Throw Exception
        doThrow(new RuntimeException("Notification Failed"))
                .when(mockService)
                .sendNotification("Welcome User");

        // Verify Exception
        assertThrows(

                RuntimeException.class,

                () -> mockService.sendNotification("Welcome User")

        );

    }

}