import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String productName;
    private double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    void showProduct() {
        System.out.println(productName + " - ₹" + price);
    }
}

// Order class
class Order {
    private int orderId;
    private List<Product> productList = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        productList.add(product);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        double total = 0;

        for (Product p : productList) {
            p.showProduct();
            total += p.getPrice();
        }

        System.out.println("Total Amount: ₹" + total);
    }
}

// Customer class
class Customer {
    private String customerName;

    Customer(String customerName) {
        this.customerName = customerName;
    }

    void placeOrder(Order order) {
        System.out.println("\nCustomer: " + customerName + " placed an order");
        order.showOrder();
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mouse", 800);

        Order order = new Order(501);
        order.addProduct(p1);
        order.addProduct(p2);

        Customer customer = new Customer("Rahul");
        customer.placeOrder(order);
    }
}
