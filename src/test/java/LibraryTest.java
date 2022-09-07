import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Book book2;
    Library library;

    @Before
    public void setUp(){
        book = new Book("J.R.R Tolkein", "Fellowship of the Ring", "Fantasy");
        book2 = new Book("J.R.R Tolkein", "The Two Towers", "Fantasy");
        library = new Library(3);
        library.addBookToStock((book));
        library.addBookToStock((book2));
    }

    @Test
    public void numberOfBooksInStock(){
        assertEquals(2, library.sizeOfStock());
    }

    @Test
    public void canAddToStock(){
        library.addBookToStock(new Book("Peter", "Hello", "Drama"));
        assertEquals(3, library.sizeOfStock());
    }

    @Test
    public void cantAddToStock(){
        library.addBookToStock(new Book("Peter", "Hello", "Drama"));
        assertEquals("Stock is full!", library.addBookToStock(new Book("Hi", "Hi", "Hi")));
    }

    @Test
    public void canCountBooksByGenre(){
        assertEquals(2, library.checkGenreNum("Fantasy"));
    }
}
