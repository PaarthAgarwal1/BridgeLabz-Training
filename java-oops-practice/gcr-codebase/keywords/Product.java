public class Product {

    // same discount percentage for all products
    static double discount = 10.0;

    // unique product ID that cannot be modified
    final int productID;

    // instance variables
    String productName;
    double price;
    int quantity;

    // constructor
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // method to display product details
    void displayDetails() {
        double discountedPrice = price - (price * discount / 100);
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: INR " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Price After Discount: INR " + discountedPrice);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 60000, 1);
        Product p2 = new Product(102, "Headphones", 3000, 2);

        // checking object type using instanceof
        if (p1 instanceof Product) {
            p1.displayDetails();
        }

        if (p2 instanceof Product) {
            p2.displayDetails();
        }

        // updating discount for all products
        Product.updateDiscount(15);

        System.out.println("After Updating Discount:\n");

        p1.displayDetails();
        p2.displayDetails();
    }
}
