interface SecurityUtils{
    static boolean strongPassword(String password){
        if(password==null||password.length()<8){
            return false;
        }
        boolean hasUpper=false,hasLower=false,hasDigit=false,hasSpecial=false;
        for(char ch:password.toCharArray()){
            if(Character.isUpperCase(ch)) hasUpper=true;
            else if(Character.isLowerCase(ch)) hasLower=true;
            else if(Character.isDigit(ch)) hasDigit=true;
            else hasSpecial=true;
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}
public class InsuracePortal {
    public static void main(String[] args) {
        String password1="StrongP@ss1";
        String password2="weakpass";
        System.out.println("Password: "+password1+" is strong? "+SecurityUtils.strongPassword(password1));
        System.out.println("Password: "+password2+" is strong? "+SecurityUtils.strongPassword(password2));
    }
}
