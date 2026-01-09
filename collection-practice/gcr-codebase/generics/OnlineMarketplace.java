import java.util.*;

// Parent class for all categories
abstract class Category {

    // Category name
    abstract String getCategoryName();

    // Minimum allowed price
    abstract double getMinPrice();

    // Maximum allowed price
    abstract double getMaxPrice();
}

// Book category
class BookCategory extends Category {

    String getCategoryName() {
        return "Books";
    }

    double getMinPrice() {
        return 100;
    }

    double getMaxPrice() {
        return 2000;
    }
}

// Clothing category
class ClothingCategory extends Category {

    String getCategoryName() {
        return "Clothing";
    }

    double getMinPrice() {
        return 300;
    }

    double getMaxPrice() {
        return 5000;
    }
}

// Gadget category
class GadgetCategory extends Category {

    String getCategoryName() {
        return "Gadgets";
    }

    double getMinPrice() {
        return 1000;
    }

    double getMaxPrice() {
        return 100000;
    }
}

// Generic Product class
// T must be a type of Category
class Product<T extends Category> {

    private String name;      // Product name
    private double price;     // Product price
    private T category;       // Product category

    // Constructor
    Product(String name, double price, T category) {

        // Check price range based on category
        if (price < category.getMinPrice() || price > category.getMaxPrice()) {
            throw new IllegalArgumentException("Invalid price for " + category.getCategoryName());
        }

        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getter for price
    double getPrice() {
        return price;
    }

    // Setter for price
    void setPrice(double price) {
        this.price = price;
    }

    // Display product details
    void display() {
        System.out.println("Product: " + name + " | Category: " + category.getCategoryName() + " | Price: ₹" + price);
    }
}

// Utility class for discount
class DiscountUtil {

    // Generic method to apply discount on any product
    public static <T extends Product<?>> void applyDiscount(
            T product, double percentage) {

        double discountedPrice =
                product.getPrice() -
                (product.getPrice() * percentage / 100);

        product.setPrice(discountedPrice);
    }
}

// Catalog class to store different product types
class Catalog {

    // Wildcard allows multiple product categories
    private List<Product<? extends Category>> products = new ArrayList<>();

    // Add product to catalog
    void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    // Display all products
    void showCatalog() {
        System.out.println("\n---- PRODUCT CATALOG ----");
        for (Product<? extends Category> p : products) {
            p.display();
        }
    }
}

// Main class
public class OnlineMarketplace {

    public static void main(String[] args) {

        // Creating products
        Product<BookCategory> book =
            new Product<>("Java Complete Guide", 800, new BookCategory());

        Product<ClothingCategory> shirt =
            new Product<>("Denim Shirt", 1500, new ClothingCategory());

        Product<GadgetCategory> phone =
            new Product<>("Smartphone", 45000, new GadgetCategory());

        // Applying discounts
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);

        // Creating catalog
        Catalog catalog = new Catalog();

        // Adding products to catalog
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        // Display catalog
        catalog.showCatalog();
    }
}
