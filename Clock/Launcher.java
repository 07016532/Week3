package Clock;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Launcher {
	

	public static void main(String [] args) throws InterruptedException{
		
		Scanner kboard = new Scanner(System.in);		
		GregorianCalendar gregCalendar = new GregorianCalendar();
		System.out.println("Please select from the following:"
							+ "\n1. 12 hour clock"
							+ "\n2. 24 hour clock");
		
		int hour = 0;		
		int minute = 0;		
		int second = 0;		
		int hourLimit = 0;	
		
		int choice  = kboard.nextInt();
		if(choice == 1) {
			hour = gregCalendar.get(Calendar.HOUR);				//Get computer clock hour
			hourLimit = 12;										//12 Hour clock
		}else if(choice == 2) {
			hour = gregCalendar.get(Calendar.HOUR_OF_DAY);		//24 hour format
			hourLimit = 23;										//24 Hour clock
		}
		
		minute = gregCalendar.get(Calendar.MINUTE);				//Get computer clock minute
		second = gregCalendar.get(Calendar.SECOND);				//Get computer clock seconds
		

		ClockDisplay timeNow = new ClockDisplay(hour,minute,(second+1), hourLimit);	//create clock with current time as parameters
		timeNow.displayClock();
		for(int i = 0; i < 30400; i++){		 // runs for number of seconds in 24 hours
			timeNow.incrementClock();		//add one to seconds
			Thread.sleep(1000);				//stops process for 1000 milliseconds (1 second)
			timeNow.displayClock();			//displays the time 
		}
	}
}
