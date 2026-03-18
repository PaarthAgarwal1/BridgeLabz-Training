import java.time.LocalDate;
import java.util.Scanner;

public class GlobalShipmentManifestValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            String str=sc.nextLine().trim();
            sb.append(validator(str));
        }
        System.out.println(sb.toString());
    }

    private static String validator(String str) {

        String[] parts = str.split("\\|");

        if(parts.length != 5){
            return "\nNON-COMPLIANT RECORD";
        }

        boolean code = shipCode(parts[0]);
        boolean date = shipDate(parts[1]);
        boolean mode = shipMode(parts[2]);
        boolean weight = shipWeight(parts[3]);
        boolean status = shipStatus(parts[4]);

        if(code && date && mode && weight && status){
            return "\nCOMPLIANT RECORD";
        }else{
            return "\nNON-COMPLIANT RECORD";
        }
    }

    private static boolean shipStatus(String part) {
        return part.equals("DELIVERED") ||
                part.equals("CANCELLED") ||
                part.equals("IN_TRANSIT");
    }

    private static boolean shipWeight(String part) {
        try{
            double weight=Double.parseDouble(part);
            if(weight<=0||weight>999999.99){
                return false;
            }
            if(part.contains(".")){
                String[] temp=part.split("\\.");
                if(temp[1].length()>2){
                    return false;
                }
            }
            if(part.length()>1&&part.charAt(0)=='0' && part.charAt(1)!='.'){
                return false;
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }

    private static boolean shipMode(String part) {
        if(part.equals("AIR")||part.equals("SEA")||part.equals("ROAD")||part.equals("RAIL")||part.equals("EXPRESS")||part.equals("FREIGHT")){
            return true;
        }
        return false;
    }

    private static boolean shipDate(String part) {
        try{
            LocalDate date = LocalDate.parse(part);
            int year = date.getYear();
            return year >= 2000 && year <= 2099;
        }catch (Exception e){
            return false;
        }
    }

    private static boolean shipCode(String part) {
        if(part.matches("^SHIP-[1-9]\\d{5}$")){
            String num = part.split("-")[1];
            for(int i=0;i<=num.length()-4;i++){
                char c1 = num.charAt(i);
                char c2 = num.charAt(i+1);
                char c3 = num.charAt(i+2);
                char c4 = num.charAt(i+3);

                if(c1==c2 && c2==c3 && c3==c4){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
