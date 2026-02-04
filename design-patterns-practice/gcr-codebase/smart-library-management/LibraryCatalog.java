import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private static LibraryCatalog instance;
    private List<Book> books;
    private List<Observer> observers;    
    private LibraryCatalog(){
        books=new ArrayList<>();
        observers=new ArrayList<>();
    }
    public static synchronized LibraryCatalog getInstance(){
        if(instance==null){
            instance=new LibraryCatalog();
        }
        return instance;
    }
    public void addBook(Book book){
        books.add(book);
        notifyObserver(book.getTitle());
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    private void notifyObserver(String bookTitle){
        for(Observer observer:observers){
            observer.update("New book available: "+bookTitle);
        }
    }
}
