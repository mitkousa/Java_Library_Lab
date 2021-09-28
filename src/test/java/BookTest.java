import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Bible", "Various", "Religious");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Bible", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Various", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Religious", book.getGenre());
    }
}
