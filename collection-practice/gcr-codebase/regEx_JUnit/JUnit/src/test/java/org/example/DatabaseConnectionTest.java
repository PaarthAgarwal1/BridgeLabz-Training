package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp(){
        dbConnection=new DatabaseConnection();
        dbConnection.connect();
    }

    @Test
    void testConnectionIsEstablished(){
        assertTrue(dbConnection.isConnected());
    }

    @Test
    void testAnotherDatabaseOperation(){
        assertTrue(dbConnection.isConnected());
    }

    @AfterEach
    void tearDown(){
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
    }

}
