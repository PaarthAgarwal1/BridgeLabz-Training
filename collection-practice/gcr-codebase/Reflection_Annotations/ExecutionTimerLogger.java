import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {

}

public class ExecutionTimerLogger {
    @LogExecutionTime
    public void fastTask(){
        for(int i=0;i<1000;i++){}
        System.out.println("Fast Task Completed");
    }
    @LogExecutionTime
    public void slowTask(){
        for(int i=0;i<10000000;i++){}
        System.out.println("Slow Task Completed");
    }

    public static void main(String[] args) throws Exception {
        ExecutionTimerLogger logger=new ExecutionTimerLogger();
        Method [] methods=ExecutionTimerLogger.class.getDeclaredMethods();

        for(Method method:methods){
            if(method.isAnnotationPresent(LogExecutionTime.class)){
                try{
                    long startTime=System.currentTimeMillis();
                    method.invoke(logger);
                    long endTime=System.currentTimeMillis();
                    System.out.println("Execution Time of "+method.getName()+": "+(endTime-startTime)+" ms");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
