import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    @Before public void setUp() {
        library = new Library();
        book1 = new Book("Becoming", "Michelle Obama", "autobiography");
        book2 = new Book("Troy", "Stephen Fry", "historical fiction");
        book3 = new Book("Quick Cooking", "Mary Berry", "Cookery");
        book4 = new Book("The 4 hour work week", "Timothy Ferris", "Lifestyle");
        book5 = new Book("Coding for Dummies", "Dummies", "Educational");
        book6 = new Book("China", "Lonely Planet", "Travel");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());

    }

    @Test
    public void canAddBooksToLibrary(){
        library.add(book1);
        library.add(book2);
        library.add(book3);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void cannotAddBook(){
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        library.add(book6);
        assertEquals(5, library.bookCount());
    }

}
