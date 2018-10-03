package Clock;

public class ClockDisplay {
	
	private NumberDisplay hour;
	private NumberDisplay minute;
	private NumberDisplay second;
	private String displayString;
	
	public ClockDisplay(int hours, int minutes, int seconds, int hourlimit){
		
		 second = new NumberDisplay(seconds);
		 minute = new NumberDisplay(minutes);
		 hour = new NumberDisplay(hours, hourlimit); 
		
	}
	
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
