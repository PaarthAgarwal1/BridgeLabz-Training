
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ClassInfo {
    public static void main(String[] args) {
        Class<?> cls = Student.class;
        System.out.println("Fields of class ");
        for(Field field : cls.getDeclaredFields()){
            System.out.println("Field: " + field.getName() + ", Type: " + field.getType().getSimpleName());
        }
        System.out.println("Methods of class ");
        for(Method method : cls.getDeclaredMethods()){
            System.out.println("Method: " + method.getName());
        }
        System.out.println("Constructors of class ");
        for(Constructor<?> constructor : cls.getDeclaredConstructors()){
            System.out.println("Constructor: " + constructor.getName());
        }
    }
    
}
