
import java.util.Scanner;

public class ConsonantOrVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        String text=sc.nextLine();
        
        String [][]result=findCharacters(text);

        System.out.println("Character\t|\tType");
        System.out.println("---------------------------------");
        display(result);
        
    }
    //Method to check the type of character
    public static String checkType(char ch){
        if(ch>='A' &&ch<='Z'){ // converting the upeer case character to lower case 
            ch=(char)(ch+32);
        }
        if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                return "Vowel";
            }else{
                return "Consonant";
            }
        }

        return "Not a Letter";
    }
    //Method to find character and store it in a array
    public static String[][] findCharacters(String text){
        String [][] arr=new String[text.length()][2];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            arr[i][0]=String.valueOf(ch);
            arr[i][1]=checkType(ch);
        }
        return arr;
    }
    //Method to Display the result
    public static void display(String[][]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+"\t\t|\t"+arr[i][1]);
        }
    }
}
