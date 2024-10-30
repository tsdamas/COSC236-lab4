package lab4.library;

import java.util.ArrayList;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.
	private Integer memberId;
	private String name;
	// private borrowedbBooks DONE: implement collection of borrowed books
	private ArrayList<Book> borrowedBooks = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
	// DONE: implement functionality of Member class
	public void borrowBook(Book book) {
		if(book.isAvailable()) {
			this.borrowedBooks.add(book);	
			book.setIsAvailable(false);
		} else {
			System.out.println("Sorry, book is not available."); 
		}
	}
	
	public void returnBook(Book book) {
		this.borrowedBooks.remove(book);
		book.setIsAvailable(true);
	}
	
	

}
