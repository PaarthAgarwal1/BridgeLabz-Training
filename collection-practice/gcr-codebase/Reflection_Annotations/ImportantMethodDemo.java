import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{
    String level() default "HIGH";
}

public class ImportantMethodDemo {
    @ImportantMethod
    public void saveData(){
        System.out.println("Saving Data");
    }
    @ImportantMethod(level="LOW")
    public void logData(){
        System.out.println("Logging Data");
    }
    public void normalMethod(){
        System.out.println("Normal Method");
    }

    public static void main(String[] args) {
        ImportantMethodDemo demo=new ImportantMethodDemo();

        for(Method method : demo.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod impMethod=method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: "+method.getName()+", Level: "+impMethod.level());
            }
        }
    }
    
}
