
import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations{
    public int add(int a ,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
}
public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter method name (add, subtract, multiply): ");
        String methodName=sc.nextLine();
        
        System.out.println("Enter the two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        MathOperations mathOps=new MathOperations();
        Class<?> cls=mathOps.getClass();

        Method method=cls.getMethod(methodName.toLowerCase(),int.class,int.class);
        int result=(int)method.invoke(mathOps,a,b);
        System.out.println("Result: "+result);
    }
}
