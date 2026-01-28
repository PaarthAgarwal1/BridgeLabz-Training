
import java.util.Scanner;


public class LexicalTwist {
    static boolean isValidWord(String word){
        if(word==null || word.isEmpty()){
            return false;
        }
        return word.trim().split(" ").length==1;
    }
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
    public static void method1(String word1){
        String sb=new StringBuilder(word1).reverse().toString();
        String str=sb.toLowerCase();
        StringBuilder transformedWord=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                transformedWord.append('@');
            }else{
                transformedWord.append(str.charAt(i));
            }
        }
        System.out.println("Transformed Word: "+transformedWord.toString());
    }
    public static void method2(String word1,String word2){
        String combined=word1+word2;
        String upperCased=combined.toUpperCase();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<upperCased.length();i++){
            char ch=upperCased.charAt(i);
            if(isVowel(ch)){
                vowels++;
            }else if((ch>='A' &&  ch<='Z')){
                consonants++;
            }
        }
        if(vowels==consonants){
            System.out.println("Vowels and consonants are equal");
        }else if(vowels>consonants){
            String unique="";
            for(int i=0;i<upperCased.length()&&unique.length()<2;i++){
                char ch=upperCased.charAt(i);
                if(isVowel(ch)&&unique.indexOf(ch)==-1){
                    unique+=ch;
                }
            }
            System.out.println(unique);
        }else{
            String unique="";
            for(int i=0;i<upperCased.length()&&unique.length()<2;i++){
                char ch=upperCased.charAt(i);
                if(!isVowel(ch)&&unique.indexOf(ch)==-1){
                    unique+=ch;
                }
            }
            System.out.println(unique);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1=sc.nextLine();
        if(!isValidWord(word1)){
            System.out.println(word1+" is an invalid word");
            return;
        }
        System.out.println("Enter second word:");
        String word2=sc.nextLine();
        if(!isValidWord(word2)){
            System.out.println(word1+" is an invalid word");
            return;
        }
        String reversedWord1=new StringBuilder(word1).reverse().toString();
        if(word2.equalsIgnoreCase(reversedWord1)){
            method1(word1);
        }else{
            method2(word1,word2);
        }
    }
    
}
