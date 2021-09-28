import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
    library = new Library(10);
    book = new Book("Bible", "Various", "Religious");
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, library.getCapacity());
    }

    @Test
    public  void hasBooksCollection(){
        assertEquals(0, library.getNumberOfBooks());
    }

}
