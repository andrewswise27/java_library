import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public void addToCollection(Library library){
        Book book = library.lendBook();
        collection.add(book);
    }

    public int sizeOfCollection(){
        return this.collection.size();
    }
}
