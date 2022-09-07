import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;
    private HashMap<String, Integer> genres;

    public Library(int capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
        this.genres = new HashMap<String, Integer>();
    }

    public int sizeOfStock(){
       return this.stock.size();
    }

    public String addBookToStock(Book book){
        if (capacity > sizeOfStock()){
            this.stock.add(book);
            return "Added to stock!";

        }
        else return "Stock is full!";
        };

    public Book lendBook(){
        return this.stock.remove(0);
    }

    public void addToGenreHashmap(Book book){

        String genre = book.getGenre();
        if(this.genres.containsKey(genre)){
            int counter = genres.get(genre);
            counter++;
            this.genres.put(genre, counter);
        } else {
            this.genres.put(genre, 1);
        }
    }
}
