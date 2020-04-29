package lab5;
/* Book Question 56
 * @author Nirdesh
 */
public class Book56 {
	public static void main(String[] args) {
		Television appleObject = new Television("Apple", 999.90);
		Television samsungObject = new Television("Samsung", 700.99);
		Television nokiaObject = new Television("Nokia", 6999);
		
		System.out.println(appleObject.getBrandName());
		appleObject.printPrice();
		
		System.out.println(samsungObject.getBrandName());
		samsungObject.printPrice();
		
		System.out.println(nokiaObject.getBrandName());
		nokiaObject.printPrice();
	}
}
