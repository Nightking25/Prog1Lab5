package lab5;
/*
 * This program creates a directory for books like a library with title, author, ISBN.
 * and it also calculates teh amount of books.
 * @aurthor Nirdesh
 */
public class Book {
	private String title;
	private String author;
	private String isbn;
	static String publisher = "Vanier";
	static int amountOfBooks;
	
	public Book() {
		this("","","");
	}
	public Book(String title) {
		this(title,"","");
	}
	public Book(String title, String author) {
		this(title, author ,"");
	}
	
	public Book(String title, String author, String isbn) {
		setBook(title, author, isbn, publisher, amountOfBooks);
	}
	
	public void setBook(String title, String author, String isbn, String publisher, int amountOfBooks) {
		setTitle(title);
		setAuthor(author);
		setIsbn(isbn);
		setAmountOfBooks();
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setAmountOfBooks(){
		amountOfBooks++;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getIsbn() {
		return isbn;
	}
	
	public String toString() {
		return(this.title);
	}
	public boolean equals(Book other) {
		return isbn.equals(other.isbn);
	}
	
	public void printBook() {
		System.out.println("\t*****************************************************************");
		System.out.printf("\t* Title: %s\n\t* Author: %s\n\t* Isbn: %s\n\t* Publisher: %s\n\t* AmountOfBooks: %d\n", getTitle(), getAuthor(), getIsbn(), publisher, amountOfBooks);
		System.out.println("\t*****************************************************************");
	}
	
}
