package Clock;

public class Launcher {
	

	public static void main(String [] args){
		
		ClockDisplay timeNow = new ClockDisplay(4,59,50);
		for(int i = 0; i < 86400; i++){
			timeNow.displayClock();
			timeNow.incrementClock();
		}
	}
}
