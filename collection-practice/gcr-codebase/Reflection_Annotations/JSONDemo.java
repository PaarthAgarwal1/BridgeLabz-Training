
import java.lang.reflect.Field;

class JSONUtils{
    public static String toJson(Object obj) throws Exception{
        StringBuilder sb=new StringBuilder();
        Class<?> objClass=obj.getClass();
        for(Field field: objClass.getDeclaredFields()){
            field.setAccessible(true);
            sb.append("\"").append(field.getName()).append("\":\"").append(field.get(obj)).append("\",");
        }
        sb.deleteCharAt(sb.length()-1);
        return "{" + sb.toString() + "}";
    }
}

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}

public class JSONDemo {
    public static void main(String[] args) throws Exception {
        Person person=new Person("John", 25);
        System.out.println("JSON Demo");
        System.out.println(JSONUtils.toJson(person));
    }
    
}
