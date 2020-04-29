package king;
/* This is an extra practice for Override constructors
 * @ aurthor Nirdesh
 */
public class MultipleConstructors2 {
	public static void main(String[] args) {
		MultipleConstructors myObject = new MultipleConstructors();
		MultipleConstructors myObject2 = new MultipleConstructors(5);
		MultipleConstructors myObject3 = new MultipleConstructors(5,13);
		MultipleConstructors myObject4 = new MultipleConstructors(5,13,43);

		System.out.printf("%s\n", myObject.toMilitary());
		System.out.printf("%s\n", myObject2.toMilitary());
		System.out.printf("%s\n", myObject3.toMilitary());
		System.out.printf("%s\n", myObject4.toMilitary());
	}
}
