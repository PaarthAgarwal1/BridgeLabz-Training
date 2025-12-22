
import java.util.Scanner;

public class ManualTrim {
    //Method to fnd the start and end index after removing the leadind and talling spaces
    public static int[] findIndices(String text){
        int start=0;
        int end=text.length()-1;
        while(start<=end && text.charAt(start)==' '){
            start++;
        }
        while(end>=start && text.charAt(end)==' '){
            end--;
        }
        return new int[]{start,end};
    }
    //Method to manualy creating the substring
    public static String findSubString(String text,int start,int end){
        String result="";
        for(int i=start;i<=end;i++){
            char ch=text.charAt(i);
            result+=ch;
        }
        return result;
    }
    //Method to compare the string
    public static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String text=sc.nextLine();
        int []indicies=findIndices(text);
        String trimmed;
        if(indicies[0]>indicies[1]){
            trimmed="";
        }else{
            trimmed=findSubString(text,indicies[0],indicies[1]);
        }
        String trimString = text.trim(); // substring using built in function
        boolean isSame=compare(trimmed,trimString); // Comparing the trimmed Strings
        System.out.println("\n=== RESULTS ===");
        System.out.println("Original String : [" + text + "]");
        System.out.println("Manual Trim     : [" + trimmed + "]");
        System.out.println("Built-in Trim   : [" + trimString + "]");
        System.out.println("Match Result    : " + (isSame ? "Same" : "Different"));
    

    }
}
