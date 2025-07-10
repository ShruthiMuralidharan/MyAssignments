package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library l = new Library();
		System.out.println(l.addBook("Think and grow"));
		l.issueBook();
	}

}