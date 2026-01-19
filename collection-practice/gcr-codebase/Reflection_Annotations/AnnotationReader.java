
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@interface Author{
    String name();
}

class Book{
    @Author(name="Paarth")
    public void displayBook(){
        System.out.println("Displaying Book");
    }
}

public class AnnotationReader {
    public static void main(String[] args) throws Exception{
            Class<Book> bookClass=Book.class;
            Method method=bookClass.getDeclaredMethod("displayBook");
            if(method.isAnnotationPresent(Author.class)){
                Author author=method.getAnnotation(Author.class);
                System.out.println("Author Name: "+author.name());
            }
    }
}