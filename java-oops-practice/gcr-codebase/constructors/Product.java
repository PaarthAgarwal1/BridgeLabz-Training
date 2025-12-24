class Product {
    // declaring instance variables
    String productName;
    double price;

    // declaring class variable shared by all objects
    static int totalProducts = 0;

    // initializing product and incrementing count
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // displaying details of the specific product
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }

    // displaying the total count using a class method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        // creating first product instance
        Product p1 = new Product("Laptop", 1200.00);
        
        // creating second product instance
        Product p2 = new Product("Smartphone", 800.00);

        // showing individual details
        p1.displayProductDetails();
        p2.displayProductDetails();

        // accessing the static method to see total count
        Product.displayTotalProducts();
    }
}