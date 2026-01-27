
import java.util.Arrays;
import java.util.List;

class Product{
    String name;
    double price;
    double rating;
    double discount;
    Product(String name, double price, double rating, double discount){
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", rating=" + rating + ", discount=" + discount + "]";
    }
}
public class CustomSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200.00, 4.5, 10.0),
            new Product("Smartphone", 800.00, 4.7, 15.0),
            new Product("Tablet", 400.00, 4.3, 5.0),
            new Product("Monitor", 300.00, 4.6, 20.0)
        );
        System.out.println("Sorting by Price:");
        products.sort((p1,p2)-> Double.compare(p1.price,p2.price));
        products.forEach(System.out::println);
        System.out.println("\nSorting by Rating:");
        products.sort((p1,p2)-> Double.compare(p1.rating, p2.rating));
        products.forEach(System.out::println);
        System.out.println("\nSorting by Discount:");
        products.sort((p1,p2)-> Double.compare(p1.discount, p2.discount));
        products.forEach(System.out::println);
    }    
}
