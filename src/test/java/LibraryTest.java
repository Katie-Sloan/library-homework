import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before public void setUp() {
        library = new Library();
        book1 = new Book("Becoming", "Michelle Obama", "autobiography");
        book2 = new Book("Troy", "Stephen Fry", "historical fiction");
        book3 = new Book("Quick Cooking", "Mary Berry", "Cookery");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());

    }



}
