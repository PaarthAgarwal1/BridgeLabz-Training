
import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] twoDArray = new int[rows][cols];
        System.out.println("Enter elements of the 2D array:");
        // Input elements for the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at (" + i + "," + j + "): "); 
                twoDArray[i][j] = sc.nextInt();
            }
        }
        int[] oneDArray = new int[rows * cols]; // size of 1D array is rows * cols
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index++] = twoDArray[i][j];
            }
        }
        // Output the 1D array
        System.out.println("The converted 1D array is:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
    }
}
