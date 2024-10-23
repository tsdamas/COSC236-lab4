package lab4.library;

import java.util.ArrayList;

public class Library {
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)

	// TODO: implement functionality of Member class
	
	private ArrayList<Book> catalog;
	
	public void addBook(String title, String author) {
		Book book = new Book(title, author);
		catalog.add(book);
	}
	
	public Book findBookByTitle(String title) {
		for(int i = 0; i < catalog.size(); i++) {
			//getTitle() not yet implemented
			if(catalog.get(i).getTitle().equals(title)) {
				return catalog.get(i);
			}
		}
	}

}
