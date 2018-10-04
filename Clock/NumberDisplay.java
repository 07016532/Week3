package Clock;

public class NumberDisplay {
	
	private int limit;
	private int value;
	
	/*		Multiple constructors as minutes and seconds limit are both 59
	 *		whereas hour has a limit dependent on 24 vs 12 hour clock.
	 *		They take in parameters passed from ClockDisplay that were themselves
	 *		passed from Main.
	 */
	
	public NumberDisplay(){
		this.value = 0;
		this.limit = 59;
	}
	
	public NumberDisplay(int value){
		this.value = value;
		this.limit = 59;
	}
	
	public NumberDisplay(int value, int limit) {
		this.value = value;
		this.limit = limit;
	}
	
	//getter method
	public int getValue(){
		return this.value;
	}
	
	//used to set the objects value i.e. 59 seconds back to 0
	public int setValue(int replacement){
		this.value = replacement;
		return this.value;
	}
	
	//Dependent on whether its reached its limit, either add 1 or use setValue(0) to reset to 0
	public int increment(){
		if (this.value == this.limit && this.limit == 12){
			this.setValue(1);
		}else if (this.value == this.limit){
			this.setValue(0);
		}else {
			this.value++;
		}
		return this.value;
	}
	
	//toString function to more easily print - condition makes 1-9 be 01 - 09 (zero-packing) 
	public String toString(){
		if(this.value < 10){
			return "0"+this.value;
		}
		return this.value+"";
	}
	
}
