package Clock;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Launcher {
	

	public static void main(String [] args) throws InterruptedException{
		
		Scanner kboard = new Scanner(System.in);		
		GregorianCalendar gregCalendar = new GregorianCalendar();
		
		int hour = gregCalendar.get(Calendar.HOUR); 
		int minute = gregCalendar.get(Calendar.MINUTE);
		int second = gregCalendar.get(Calendar.SECOND);
		int hourlimit = 23;
		
		ClockDisplay timeNow = new ClockDisplay(hour,minute,(second+1), hourlimit);
		timeNow.displayClock();
		for(int i = 0; i < 80400; i++){ // runs for number of seconds in 24 hours
			timeNow.incrementClock();
			//Thread.sleep(1000);
			timeNow.displayClock();
		}
	}
}
