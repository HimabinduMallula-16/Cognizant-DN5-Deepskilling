package com.cognizant;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class InteractionOrderTest {

    @Test
    public void testInteractionOrder() {

        // Create Mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Create Service
        MyService service = new MyService(mockApi);

        // Call Method
        service.processData();

        // Verify Order
        InOrder inOrder = Mockito.inOrder(mockApi);

        inOrder.verify(mockApi).login();

        inOrder.verify(mockApi).getData();

        inOrder.verify(mockApi).logout();

    }

}