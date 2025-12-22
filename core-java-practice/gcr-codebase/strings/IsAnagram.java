
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        // Taking user input for string
        System.out.print("Enter first string: ");
        String str1=Sc.nextLine();
        System.out.print("Enter second string: ");
        String str2=Sc.nextLine();
        if(str1.length()!=str2.length()){// check the length of string is same or not
             System.out.println("The String "+str1+" and "+str2+" are not Anagram");
            return;
        }
        boolean isAnagram= checkAnagram(str1,str2); // Method calling to check if string anagram
        if(isAnagram){
            System.out.println("The String "+str1+" and "+str2+" are Anagram");
        }else{
            System.out.println("The String "+str1+" and "+str2+" are not Anagram");
        }

    }
    // checking for strings to be anagram
    public static boolean checkAnagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        //storing the frequency of the string character's 
        int[] charCount1=new int[26]; 
        int[] charCount2=new int[26];
        for(int i=0;i<str1.length();i++){
            charCount1[str1.charAt(i)-'a']++;
            charCount2[str2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(charCount1[i]!=charCount2[i]){
                return false;
            }
        }
        return true;
    }
}
