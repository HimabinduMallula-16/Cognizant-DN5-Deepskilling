package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class FileServiceTest {

    @Test
    public void testServiceWithMockFileIO() {

        // Create Mock Objects
        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        // Stub read() Method
        when(mockFileReader.read())
                .thenReturn("Mock File Content");

        // Create Service
        FileService fileService =
                new FileService(mockFileReader, mockFileWriter);

        // Call Method
        String result = fileService.processFile();

        // Verify Result
        assertEquals("Processed Mock File Content", result);

        // Verify write() was called
        verify(mockFileWriter)
                .write("Mock File Content");

    }

}