package org.example;

public class StringUtils {

    public String reverse(String str){
        if(str==null){
            return null;
        }
        String reversed = "";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }

    public boolean isPalindrome(String str){
        if(str==null){
            return false;
        }
        String reversed = reverse(str);
        return str.equals(reversed);
    }
    public String toUpperCase(String str){
        if(str == null){
            return null;
        }
        return str.toUpperCase();
    }
}
