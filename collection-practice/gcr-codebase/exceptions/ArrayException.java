
import java.util.Scanner;


public class ArrayException {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n=sc.nextInt();
        int [] arr =new int[n];
        System.out.println("Enter the value of element");
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx]=sc.nextInt();
        }
        System.out.print("Enter the index : ");
        int index=sc.nextInt();

        try {
            // Access array element
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
    
}
