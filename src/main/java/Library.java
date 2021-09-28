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

    public void addBook(Book book) {
        if (getCapacity() > 0) {
            this.booksCollection.add(book);
        }
    }

    public Book removeBook(Book book) {
        int relevantBook = this.booksCollection.indexOf(book);
        return booksCollection.remove(relevantBook);
    }

    public void lendBook(Book book, Borrower borrower) {
        if (borrower.getBooks() < 2){
            this.removeBook(book);
            borrower.addBook(book);
        }
    }
}
