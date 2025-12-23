import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        if (text.equals(reversed)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

        sc.close();
    }
}
