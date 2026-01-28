
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils{
    static String formatDate(LocalDate date,String pattern){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
public class InvoiceGenerator {
    public static void main(String[] args) {
        LocalDate invoiceDate=LocalDate.now();
        String format1=DateUtils.formatDate(invoiceDate,"dd-MM-yyyy");
        String format2=DateUtils.formatDate(invoiceDate,"yyyy-MM-dd");
        String format3=DateUtils.formatDate(invoiceDate, "MM-dd-yyyy");
        System.out.println("Invoice Date in dd-MM-yyyy format: " + format1);
        System.out.println("Invoice Date in yyyy-MM-dd format: " + format2);
        System.out.println("Invoice Date in MM-dd-yyyy format: " + format3);
    }
}
