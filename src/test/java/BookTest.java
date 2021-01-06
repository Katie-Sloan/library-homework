import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp() {
        book = new Book("Becoming", "Michelle Obama", "autobiography");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Becoming", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Michelle Obama", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("autobiography", book.getGenre());
    }

}
