
class Book {

    // Attributes
    String title;
    String author;
    double price;

    // Default Constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : INR " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {

        // Using default constructor
        Book b1 = new Book();
        b1.displayBookDetails();

        System.out.println();

        // Using parameterized constructor
        Book b2 = new Book("Effective Java", "Joshua Bloch", 550.0);
        b2.displayBookDetails();
    }
}
