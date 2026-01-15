package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class FileProcessorTest {

    @Test
    void testWriteAndReadFile() throws IOException {
        FileProcessor fp = new FileProcessor();
        String filename = "test.txt";
        String content = "Hello JUnit";

        fp.writeToFile(filename, content);
        String result = fp.readFromFile(filename);

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        FileProcessor fp = new FileProcessor();
        String filename = "exist.txt";

        fp.writeToFile(filename, "Test");

        File file = new File(filename);
        assertTrue(file.exists());
    }

    @Test
    void testReadFileNotExists() {
        FileProcessor fp = new FileProcessor();

        assertThrows(IOException.class, () -> {
            fp.readFromFile("nofile.txt");
        });
    }
}

