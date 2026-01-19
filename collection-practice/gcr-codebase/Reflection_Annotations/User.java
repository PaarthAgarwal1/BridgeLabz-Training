import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength{
    int value();
}

public class User {
    @MaxLength(10)
    private String username;

    User(String username){
        validate(username);
        this.username=username;
    }

    private void validate(String username){
        try{
            MaxLength maxLength=this.getClass().getDeclaredField("username").getAnnotation(MaxLength.class);
            if(maxLength!=null && username.length()>maxLength.value()){
                throw new IllegalArgumentException("Username exceeds maximum length of "+maxLength.value());
            }
        }catch(NoSuchFieldException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new User("ShortName"); // Valid
        new User("ThisIsAVeryLongUsername"); // Throws exception
    }
    
}
