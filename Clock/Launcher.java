package Clock;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Launcher {
	

	public static void main(String [] args) throws InterruptedException{
		
		GregorianCalendar gregCalendar = new GregorianCalendar();
		int hour = gregCalendar.get(Calendar.HOUR); 
		int minute = gregCalendar.get(Calendar.MINUTE);
		int second = gregCalendar.get(Calendar.SECOND);
		
		ClockDisplay timeNow = new ClockDisplay(hour,minute,(second+1));
		timeNow.displayClock();
		for(int i = 0; i < 86400; i++){
			timeNow.incrementClock();
			Thread.sleep(1000);
			timeNow.displayClock();
		}
	}
}
