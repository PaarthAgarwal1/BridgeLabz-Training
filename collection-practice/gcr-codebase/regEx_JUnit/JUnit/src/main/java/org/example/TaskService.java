package org.example;

public class TaskService {
    public String longRuningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task Completed";
    }
}
