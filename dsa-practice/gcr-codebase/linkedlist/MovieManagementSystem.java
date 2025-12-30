class MovieNode{
    String title;
    String director;
    int yearOfRelaese;
    double rating;
    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int yearOfRelaese, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelaese = yearOfRelaese;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }

    
}

class MovieDoublyLinkedList{
    private MovieNode head;
    private MovieNode tail;

    //Add at beginning
    public void addAtBeginning(String title,String director,int yearOfRelaese,double rating){
        MovieNode newNode=new MovieNode(title, director, yearOfRelaese, rating);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    //Add at end
    public void addAtEnd(String title,String director,int yearOfRelaese,double rating){
        MovieNode newNode=new MovieNode(title, director, yearOfRelaese, rating);
        if(tail==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    //Add at specific position (1-based)
    public void addAtPosition(int position,String title,String director,int yearOfRelaese,double rating){
        if(position<=1){
            addAtBeginning(title, director, yearOfRelaese, rating);
            return;
        }
        MovieNode temp=head;
        for(int i=1;i<position-1&&temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null||temp.next==null){
            addAtEnd(title, director, yearOfRelaese, rating);
            return;
        }
        MovieNode newNode=new MovieNode(title, director, yearOfRelaese, rating);
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;
    }

    //Remove by movie title
    public void removeByTitle(String title){
        MovieNode temp=head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Movie removed: " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");


    }

    // Search by Director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found for director: " + director);
    }

    // Search by Rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found with rating: " + rating);
    }

    // Update rating by title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    private void displayMovie(MovieNode m) {
        System.out.println("Title: " + m.title +", Director: " + m.director +", Year: " + m.yearOfRelaese +", Rating: " + m.rating);
    }

}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        list.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.addAtEnd("Titanic", "James Cameron", 1997, 7.9);

        System.out.println("\nAll Movies (Forward):");
        list.displayForward();

        System.out.println("\nAll Movies (Reverse):");
        list.displayReverse();

        System.out.println("\nSearch by Director:");
        list.searchByDirector("Christopher Nolan");

        System.out.println("\nUpdate Rating:");
        list.updateRating("Titanic", 8.2);

        System.out.println("\nRemove Movie:");
        list.removeByTitle("Inception");

        System.out.println("\nFinal Movie List:");
        list.displayForward();
    }
    
}
