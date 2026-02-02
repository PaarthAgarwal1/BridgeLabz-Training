
import java.util.Arrays;
import java.util.List;


public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockPrice=Arrays.asList(1450.75,1453.30,1448.89,1345.67,1456.78);
        //Print live stocj price updates
        stockPrice.stream().forEach(price->System.out.println("Stock price Update: "+price));
    }
}
