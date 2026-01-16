import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo{
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

public class TodoDemo {

    @Todo(task="Add validation",assignedTo="Paarth",priority="HIGH")
    public void validateInput(){
        System.out.println("Validating Input");
    }

    @Todo(task="Implement logging",assignedTo="Garvit")
    public void logActivity(){
        System.out.println("Logging Activity");
    }

    @Todo(task="Optimize performance",assignedTo="Vyomi",priority="LOW")
    public void optimizeCode(){
        System.out.println("Optimizing Code");
    }

    public static void main(String[] args) {
        Method [] methods=TodoDemo.class.getDeclaredMethods();

        for(Method method:methods){
            if(method.isAnnotationPresent(Todo.class)){
                Todo todo=method.getAnnotation(Todo.class);
                System.out.println("Method: "+method.getName()+", Task: "+todo.task()+", Assigned To: "+todo.assignedTo()+", Priority: "+todo.priority());
            }
        }
    }
    
}
