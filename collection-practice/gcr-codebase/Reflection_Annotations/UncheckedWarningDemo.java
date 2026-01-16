import java.util.*;

public class UncheckedWarningDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123); // This will cause an unchecked warning without @SuppressWarnings
        for(Object element : list){
            System.out.println("Element: " + element);
        }
    }
    
}
