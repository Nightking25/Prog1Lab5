package lab5;
/*
 * this is teh Client class for Book class
 * @author Nirdesh
 */
public class Question3 {
	public static void main(String[] args) {
		Book book1 =  new Book("Harry Potter and the Deathly Hallows (Book 7)", "J.K. Rowling", "9780545010221");
		book1.printBook();
		
		Book book2 =  new Book("The Outsider", "Stephen King", "9781432852641");
		book2.printBook();
		
		Book book3 =  new Book("P.S. I Like You", "Kasie West", "9781338160680");
		book3.printBook();
		
		Book book4 =  new Book("A Game of Thrones: A Song of Ice and Fire: Book One", "George R. R. Martin", "9780553381689");
		book4.printBook();
		
	}
}
