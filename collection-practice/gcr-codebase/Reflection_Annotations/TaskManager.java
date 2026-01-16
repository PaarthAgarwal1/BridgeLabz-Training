
import java.lang.annotation.*;
import java.lang.reflect.Method;

enum Priority{
    HIGH,
    MEDIUM,
    LOW
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo{
    Priority priority() default Priority.MEDIUM;
    String assignedTo() default "Unassigned";
}



public class TaskManager {
    @TaskInfo(priority=Priority.HIGH,assignedTo="Paarth")
    public void completeTask(){
        System.out.println("Task Completed");
    }
    public static void main(String[] args) throws Exception {

        TaskManager manager=new TaskManager();

        Method method=manager.getClass().getMethod("completeTask");

        TaskInfo takInfo=method.getAnnotation(TaskInfo.class);

        System.out.println("Priority: "+takInfo.priority());
        System.out.println("Assigned To: "+takInfo.assignedTo());
    }
}
