import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowerCollection;
    private String name;

    public Borrower(String name){
        this.name = name;
        this.borrowerCollection = new ArrayList<>();
    }
}
