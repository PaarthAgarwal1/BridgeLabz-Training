import javax.xml.transform.Templates;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DynamicTemplateProcessor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            String output= templateProcessor(str);
            System.out.println(output);
        }
    }

    private static String templateProcessor(String str) {
        String []parts=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String s:parts){
            if(s.charAt(0)!='$'){
                sb.append(s);
            }else {
                String subStr=s.substring(2,s.length()-1);
                String []data=subStr.split(":");
                try{
                    if(data[0].equals("UPPER")){
                        sb.append(data[1].toUpperCase());
                    }
                    if (data[0].equals("LOWER")) {
                        sb.append(data[1].toLowerCase());
                    }
                    if (data[0].equals("REPEAT")) {
                        String temp[]=data[1].split(",");
                        int r=Integer.parseInt(temp[1]);
                        for(int i=0;i<r;i++){
                            sb.append(temp[0]);
                        }
                    }
                    if(data[0].equals("DATE")){
                        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
                        LocalDate date=LocalDate.parse(data[1],formatter);
                        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
                        String date1=date.format(formatter1);
                        sb.append(date1);
                    }
                }catch (Exception e){
                    sb.append("INVALID");
                }
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
