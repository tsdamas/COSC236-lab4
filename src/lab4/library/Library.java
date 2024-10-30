package lab4.library;

import java.util.ArrayList;
import java.util.Hashtable;

public class Library {
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)

	// TODO: implement functionality of Member class
	
	private ArrayList<Book> catalog = new ArrayList<>();
	// private members (list of Members)
	private Hashtable<String, Member> members = new Hashtable<>();
	
	public void addBook(String title, String author) {
		Book book = new Book(title, author);
		catalog.add(book);
	}
	
	public Book findBookByTitle(String title) {
		for(int i = 0; i < catalog.size(); i++) {
			if(catalog.get(i).getTitle().equals(title)) {
				return catalog.get(i);
			}
		}
		return null;
	}
	
	
	public void registerMember(String name) {
		Member member = new Member(name);
		members.put(name, member); 
	}
	
	public void removeMember(String name) {
		members.remove(name);
	}
	
	public Member findMemberByName(String name) {
		return members.get(name);
	}
	
	 // Show the available books in the library
	 public void showAvailableBooks() {
	     System.out.println("Available Books:");
	     for (Book book : catalog) {
	    	 if(book.isAvailable()) {
	    		 System.out.println(book);
	    		 
	    	 }
	     }
	 }

	//Show members of in the library
	public void showMembers() {
	   System.out.println("Library members:");
	   for (String member : members.keySet()) {
	       System.out.println(member);
	   }
	}

}
