package BookShop;

public class Main {
	
	public static void main(String[] args){
		
		BookService bookService = new BookService();
		
		bookService.addToList("HP1", "Harry Potter and the Philosipher's Stone", "J. K. Rowling",
				"fj34895yfo", "Science-Fiction");
		bookService.addToList("HP2", "Harry Potter and the Chamber of Secrets", "J. K. Rowling",
				"fj34895yfo", "Science-Fiction");
		
		bookService.deleteFromList("HP2");
	}

}
