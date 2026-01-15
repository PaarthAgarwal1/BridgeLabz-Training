package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
public class TaskServiceTest {

    @Test
    @Timeout(value = 2,unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeOut() throws InterruptedException{
        TaskService taskService = new TaskService();
        String result = taskService.longRuningTask();
        assertEquals("Task Completed",result);
    }
}
