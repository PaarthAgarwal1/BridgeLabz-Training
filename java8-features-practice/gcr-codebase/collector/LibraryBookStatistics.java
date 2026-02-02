import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Book class
class Book {
    private String title;
    private String genre;
    private int pages;

    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}

public class LibraryBookStatistics {
    public static void main(String[] args) {
        // Sample list of books
        List<Book> books = Arrays.asList(
            new Book("Book A", "Fiction", 300),
            new Book("Book B", "Science", 150),
            new Book("Book C", "Fiction", 450),
            new Book("Book D", "Science", 200),
            new Book("Book E", "History", 500)
        );

        // Group books by genre and summarize pages
        Map<String, IntSummaryStatistics> bookStatsByGenre = books.stream()
            .collect(Collectors.groupingBy(
                Book::getGenre,
                Collectors.summarizingInt(Book::getPages)
            ));

        // Print statistics per genre
        System.out.println("Library Book Statistics by Genre:");
        bookStatsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total Pages: " + stats.getSum());
            System.out.println("  Average Pages: " + stats.getAverage());
            System.out.println("  Max Pages: " + stats.getMax());
            System.out.println();
        });
    }
}
