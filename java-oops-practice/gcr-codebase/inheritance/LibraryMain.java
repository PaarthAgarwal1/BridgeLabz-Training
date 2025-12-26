// Parent class
class Book {
    String title;
    int publicationYear;

    //Constructor for Book 
    Book(String title, int publicationYear) {
        this.title= title;
        this.publicationYear= publicationYear;
    }
}

// extending Book to create Author
class Author extends Book {
    String authorName;
    String bio;

    // Constructor for Author
    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName= authorName;
        this.bio= bio;
    }

    // Method to display
    void displayInfo() {
        System.out.println("Book: "+ title + " (" + publicationYear + ")");
        System.out.println("Author: "+ authorName);
        System.out.println("Bio: "+ bio);
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        // creating an author object
        Author a= new Author("The Hobbit", 1937, "J.R.R. Tolkien", "English writer and philologist.");

        a.displayInfo();
    }
}