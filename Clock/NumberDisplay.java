package Clock;

public class NumberDisplay {
	
	private int limit;
	private int value;
	
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
	

	public int getValue(){
		return this.value;
	}
	
	public int setValue(int replacement){
		this.value = replacement;
		return this.value;
	}
	
	public int increment(){
		if (this.value == this.limit){
			this.setValue(0);
		}else{
			this.value++;
		}
		return this.value;
	}
	
	public String toString(){
		if(this.value < 10){
			return "0"+this.value;
		}
		return this.value+"";
	}
	
}
