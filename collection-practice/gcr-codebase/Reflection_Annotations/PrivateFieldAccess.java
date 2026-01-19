
import java.lang.reflect.Field;

class Person{
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Alice",30);

        Field filed=Person.class.getDeclaredField("name");
        filed.setAccessible(true);
        filed.set(person, "Paarth");
        System.out.println("Updated Name: " + filed.get(person));

    }    
}
