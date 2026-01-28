
import java.util.Scanner;


public class FlipKeyProgram {
    public static String CleanseAndInvert(String word){
        if(word==null ||word.isEmpty() || word.length()<6){
            return "";
        }
        String digits="1234567890";
        String specialCharacters="!@#$%^&*";
        boolean isDigit=false;
        boolean isSpecialCharater=false;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(digits.indexOf(ch)!=-1){
                isDigit=true;
            }
            if(specialCharacters.indexOf(ch)!=-1){
                isSpecialCharater=true;
            }
        }
        if(word.split(" ").length>1 || isDigit || isSpecialCharater){
            return "";
        }else{
            word=word.toLowerCase();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(ch%2!=0){
                    sb.append(ch);
                }
            }
            word=sb.reverse().toString();
            sb=new StringBuilder();
            for(int i=0;i<word.length();i++){
                if(i%2==0){
                    sb.append(Character.toUpperCase(word.charAt(i)));
                }else{
                    sb.append(word.charAt(i));
                }
            }
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=sc.nextLine();
        String result=CleanseAndInvert(word);
        if(result.isEmpty()){
            System.out.println("Invalid Input");
            return;
        }else{
            System.out.println("The generated key is - "+result);
        }
    }
}
