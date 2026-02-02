import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    String customer;
    double total;

    Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {

        // Sample list of orders
        List<Order> orders = Arrays.asList(
            new Order("Cust1", 150.0),
            new Order("Cust2", 200.0),
            new Order("Cust1", 50.5),
            new Order("Cust3", 300.0)
        );

        // Summing order totals per customer
        Map<String, Double> revenueSummary = orders.stream()
            .collect(Collectors.groupingBy(
                order -> order.customer,
                Collectors.summingDouble(order -> order.total)
            ));

        // Display the results in a readable format
        System.out.println("Order Revenue Summary per Customer:");
        revenueSummary.forEach((customer, total) ->
            System.out.println("Customer: " + customer + ", Total Revenue: " + total)
        );
    }
}
