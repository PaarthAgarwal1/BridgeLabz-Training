
import java.lang.reflect.Method;

class Task{
    public void work() throws InterruptedException{
        Thread.sleep(500); // Simulate work
    }
}

public class MethodTiming {
    public static void main(String[] args) throws Exception {
        Task task=new Task();
        Method method=task.getClass().getDeclaredMethod("work");
        long startTime=System.currentTimeMillis();
        method.invoke(task);
        long endTime=System.currentTimeMillis();
        System.out.println("Method execution time: " + (endTime - startTime) + " miliseconds");
    }    
}
