package org.example;

public class PasswordValidator {
    public boolean isValid(String password){
        if(password==null){
            return false;
        }
        boolean hasUpperCase=false;
        boolean hasDigit=false;
        boolean hasLowerCase=false;

        if(password.length()<8){
            return false;
        }
        for(char ch:password.toCharArray()){
            if(Character.isUpperCase(ch)){
                hasUpperCase=true;
            }
            if(Character.isDigit(ch)){
                hasDigit=true;
            }
            if(Character.isLowerCase(ch)){
                hasLowerCase=true;
            }
        }
        return hasDigit && hasUpperCase && hasLowerCase;
    }
}
