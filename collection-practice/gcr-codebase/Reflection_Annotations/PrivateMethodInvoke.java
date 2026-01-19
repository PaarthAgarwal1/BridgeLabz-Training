
import java.lang.reflect.Method;

class Calculator{
    private int add(int a,int b){
        return a+b;
    }
}

public class PrivateMethodInvoke {
    public static void main(String [] args) throws Exception {
        Calculator calc = new Calculator();
        Method method = Calculator.class.getDeclaredMethod("add", int.class, int.class);
        method.setAccessible(true);
        int result = (int) method.invoke(calc, 5, 10);
        System.out.println("Result: " + result);
    }
}
