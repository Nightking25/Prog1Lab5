package lab5;
/* This question calculates the GCD between two given numbers.
 * @author Nirdesh
 */
import java.util.*;
public class Question2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNumber, secondNumber, gcd = 1;
		System.out.println("Please input your first interger: ");
		
		String input;
		
		while(!scanner.hasNextInt()){
			System.out.println("Sorry, This is not an integer!");
			input =  scanner.nextLine();
			System.out.println("Please input your first interger: ");
		}		
		
		firstNumber = scanner.nextInt();
		input = "";
		System.out.println("Please input your Second interger: ");
		
		while(!scanner.hasNextInt()){
			System.out.println("Sorry, This is not an integer!");
			input =  scanner.nextLine();
			System.out.println("Please input your Second interger: ");
		}		
		secondNumber = scanner.nextInt();
		
		while (firstNumber != secondNumber) {
	        if(firstNumber > secondNumber) {
	        	firstNumber = firstNumber - secondNumber;
	        } else {
	        	secondNumber= secondNumber - firstNumber;	        		
	        }
	    }
		System.out.printf("The GCD of given numbers is: %d", secondNumber);
	}	
}
