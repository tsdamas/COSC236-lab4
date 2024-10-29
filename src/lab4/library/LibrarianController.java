package lab4.library;

import java.util.ArrayList;
import java.util.HashMap;

public class LibrarianController {
	
	private LIbrary library;
	
	public LibrarianController(Library library) {
		this.library = library;
	}

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
	
	/**
	 * This method uses the library class to get the member and book then uses member to borrow a book
	 * @param memberId
	 * @param title
	 */
	public void borrowBook(String memberId, String title) {
        Member member = library.findMemberByName(memberId);
        Book book = library.findBookByTitle(title);

        if (member != null && book != null) {
            member.borrowBook(book);
        } else {
            System.out.println("Member or book not found.");
        }
    }

	/**
	 * This method uses the library class to get the member and book then uses member to return a book
	 * @param memberId
	 * @param title
	 */
    public void returnBook(String memberId, String title) {
        Member member = library.findMemberByName(memberId);
        Book book = library.findBookByTitle(title);

        if (member != null && book != null) {
            member.returnBook(book);
        } else {
            System.out.println("Member or book not found.");
        }
    }

}
