import java.lang.reflect.Constructor;
import java.util.InputMismatchException;

public class TimeClass {
	private int hour;
	private int minute;
	private int second;
	TimeClass(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public int setHour() {
		 	try {
			if(-1<hour && hour<25) {
			throw new IllegalArgumentException("Enter a valid value");
			}
		 	}
			catch(Exception e) {
			System.out.println(e.getMessage());
		 	}
		 	return hour;
	}
		
	public int setMinute() {
		try {
			if(-1<minute && minute<60) {
				throw new IllegalArgumentException("please enter a valid value.");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return minute;
	}
	public int setSecond() {
		try {
			if(-1<second && second<60) {
				throw new IllegalArgumentException("please enter a valid value.");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return second;
	}
}
