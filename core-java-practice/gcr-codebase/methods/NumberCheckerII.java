
import java.util.Scanner;


public class NumberCheckerII extends NumberChecker {// Extends the number checker class 
    //Method to reverse the digits
    public static int[] reverseDigitsArray(int[]digits){
        int [] reversed=new int[digits.length];
        int index=0;
        for(int i=digits.length-1;i>=0;i--){
            reversed[index++]=digits[i];
        }
        return reversed;
    }
    // Method to compare the two arrays
    public static boolean compareArrays(int[]arr1,int[]arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    
    // Method to check for palindrome
    public static boolean isPalindrome(int []digits){
        int [] reversed=reverseDigitsArray(digits);
        return compareArrays(digits,reversed);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // User Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number); // extended method from parent class

        System.out.println("\nDigits:");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        int[] reversed = reverseDigitsArray(digits);

        System.out.println("\n\nReversed Digits:");
        for (int d : reversed) {
            System.out.print(d + " ");
        }

        System.out.println("\n\nArrays Equal: " +
                compareArrays(digits, reversed));

        System.out.println("Palindrome Number: " +
                (isPalindrome(digits) ? "Yes" : "No"));

        System.out.println("Duck Number: " +
                (isDuckNumber(digits) ? "Yes" : "No"));

        sc.close();
    }
}
