import java.util.ArrayList;

public class Library {
    private ArrayList<Book> booksCollection;
    private Integer capacity;

    public Library(Integer capacity){
        this.capacity = capacity;
        this.booksCollection = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity - this.booksCollection.size();
    }

    public int getNumberOfBooks() {
        return this.booksCollection.size();
    }
}
