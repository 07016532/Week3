package Clock;

public class ClockDisplay {
	
	private NumberDisplay hour;		//create object name
	private NumberDisplay minute;	// 	same as above
	private NumberDisplay second;	//	same as above
	private String displayString;	
	
	//constructor takes our current time parameters from main
	public ClockDisplay(int hours, int minutes, int seconds, int hourlimit){	
		
		 second = new NumberDisplay(seconds);	//initialise object with parameters from main as their own parameters
		 minute = new NumberDisplay(minutes);			// same as above
		 hour = new NumberDisplay(hours, hourlimit); 	//same as above * note hour limit for 24/12 hour clock is here
		
	}
	
	//displays the objects created from NumberDisplay class for each obect
	public void displayClock(){
		System.out.println(this.hour+":"+this.minute+":"+this.second);
	}

	public void incrementClock(){
		if(this.minute.getValue() == 59 && this.second.getValue() == 59){
			this.hour.increment();
		}
		if(this.second.getValue() == 59){
			this.minute.increment();
		}
		this.second.increment();
	}	
}
