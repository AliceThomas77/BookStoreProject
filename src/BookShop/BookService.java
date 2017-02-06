package BookShop;
import java.util.HashMap;
import java.util.Map;


public class BookService {
	
	Map<String, Book> bookShop = new HashMap<String, Book>();
	
	public void addToList(String name, String title, String author, String isbn, String genre){
		Book book = new Book(title, author, isbn, genre);
		bookShop.put(name, book);
	}
	
	public void deleteFromList(String name){
		bookShop.remove(name);
	}

}
