import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book1;
    Library library;

    @Before
    public void setUp() {
        borrower = new Borrower("Katie");
        book1 = new Book ("Becoming", "Michelle Obama", "autobiography");
        library = new Library();
    }

    @Test
    public void startsWithNoBooks() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook() {
        library.add(book1);
        borrower.borrowBook(book1, library);
        assertEquals(0, library.bookCount());
        assertEquals(1, borrower.bookCount());
    }

}
