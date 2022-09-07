import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book book;
    Library library;
    Borrower borrower;

    @Before
    public void setUp(){
        book = new Book("Class", "Book", "Right?");
        library = new Library(2);
        borrower = new Borrower();
        library.addBookToStock(book);
    }

    @Test
    public void canLendBook(){
        borrower.addToCollection(library);
        assertEquals(1, borrower.sizeOfCollection());
    }
}
