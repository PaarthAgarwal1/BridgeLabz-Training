import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        boolean[] visited = new boolean[256];
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (!visited[ch]) {
                visited[ch] = true;
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}
