package king;

public class PublicPrivateAndThis {
	public static void main(String[] args) {
		PublicPrivateAndThis2 timeObject =  new PublicPrivateAndThis2();
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());
		
		timeObject.setTime(13, 27, 6);
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toString());
		
		
	}
}
