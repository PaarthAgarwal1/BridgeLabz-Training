
import java.util.Scanner;

public class Book {
    static String libraryName= "GLA Central Library"; // same for every instance
    final String isbn;
    String title;
    String author;

    //Constructor
    Book(String title, String author, String isbn) {
        this.title= title;
        this.author= author;
        this.isbn= isbn;
    }

   //Method to display the library
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Displaying book details
    void showBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Book.displayLibraryName();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the title of book : ");
        String title=sc.nextLine();
        System.out.print("Enter the name of the Author of the book : ");
        String author=sc.nextLine();
        System.out.print("Enter the ISBN : ");
        String isbn=sc.nextLine();
        // creating a new book object
        Book myBook= new Book(title,author,isbn);

        // verifying if the object is an instance of Book
        if (myBook instanceof Book) {
            myBook.showBookInfo();
        }
    }
}