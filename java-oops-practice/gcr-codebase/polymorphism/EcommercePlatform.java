// Interface for tax-related operations
interface Taxable {

    // Method to calculate tax on price
    double calculateTax(double price);

    // Method to return tax information
    String getTaxDetails();
}

// Abstract class representing a product
abstract class Product {

    // Product details (kept private for safety)
    private String productId;
    private String name;
    private double price;

    // Constructor to initialize product values
    Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Returns product price
    public double getPrice() {
        return price;
    }

    // Returns product name
    public String getName() {
        return name;
    }

    // Method to calculate discount (implemented by subclasses)
    abstract double calculateDiscount();
}

// Class for electronic products
class Electronics extends Product implements Taxable {

    Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    // Electronics discount
    @Override
    double calculateDiscount() {
        return getPrice() * 0.10; // 10% off
    }

    // Tax for electronics
    @Override
    public double calculateTax(double price) {
        return price * 0.18; // 18% tax
    }

    // Tax description
    @Override
    public String getTaxDetails() {
        return "18% tax on electronics";
    }
}

// Class for clothing products
class Clothing extends Product implements Taxable {

    Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    // Clothing discount
    @Override
    double calculateDiscount() {
        return getPrice() * 0.20; // 20% off
    }

    // Tax for clothing
    @Override
    public double calculateTax(double price) {
        return price * 0.05; // 5% tax
    }

    // Tax description
    @Override
    public String getTaxDetails() {
        return "5% tax on clothing";
    }
}

// Class for grocery products
class Groceries extends Product {

    Groceries(String id, String name, double price) {
        super(id, name, price);
    }

    // Grocery discount
    @Override
    double calculateDiscount() {
        return getPrice() * 0.05; // 5% off
    }
}


public class EcommercePlatform {
    public static void main(String[] args) {

        // Array of different product types
        Product[] cart = {
            new Electronics("E101", "Laptop", 750.0),
            new Clothing("C201", "T-Shirt", 40.0),
            new Groceries("G301", "Wheat Flour", 25.0)
        };

        // Loop through each product
        for (Product p : cart) {

            double price = p.getPrice();
            double discount = p.calculateDiscount();
            double tax = 0;

            // Check if product has tax
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax(price);
            }

            double finalPrice = price + tax - discount;

            System.out.println("Product Name    : " + p.getName());
            System.out.println("Original Price  : $" + price);
            System.out.println("Discount        : -$" + discount);
            System.out.println("Tax             : +$" + tax);
            System.out.println("Amount to Pay   : $" + finalPrice);
            System.out.println("----------------------");
        }
    }
}
