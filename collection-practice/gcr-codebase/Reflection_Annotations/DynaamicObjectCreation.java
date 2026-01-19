
import java.lang.reflect.Constructor;

class Student {
    String name;
    Student (String name){
        this.name=name;
    }
}

public class DynaamicObjectCreation {
    public static void main(String[] args) throws Exception{
        Class<?> cls =Class.forName("Student");
        Constructor<?> constructor=cls.getDeclaredConstructor(String.class);
        Student student=(Student)constructor.newInstance("Paarth");
        System.out.println("Student Name: "+student.name);
        
    }
}
