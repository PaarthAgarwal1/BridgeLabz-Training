
import java.lang.reflect.Field;

class Configuration{
    private static String API_KEY="OLD_KEY";

    public static String getApiKey(){
        return API_KEY;
    }
}

public class StaticFieldAccess {
    public static void main(String[] args) throws Exception {
        Class<Configuration> configClass=Configuration.class;
        Field field=configClass.getDeclaredField("API_KEY");
        field.setAccessible(true);
        field.set(null, "NEW_API_KEY");
        System.out.println("Updated API_KEY: " + Configuration.getApiKey());
    }
}
