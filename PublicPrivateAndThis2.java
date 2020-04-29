package king;

public class PublicPrivateAndThis2 {
	/*private means only this class has access to these variables
	 * if we try to use these in other class it doesnt work
	 * We have to change the private to public if we want to use it in any class
	 * outside of this class (PublicPrivateAndThis2).
	 */
	private int hour = 1;
	private int minute = 2;
	private int second = 3;
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;		
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d %s",((hour == 0|| hour == 12)) ? 12:hour%12, minute, second, (hour<12? "AM": "PM" ));
	}
}	
