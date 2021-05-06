package Exercise4_4;

public class Fruit {
		
	protected String name; 
	
	public Fruit(){ //constructor without argument
		this.name = " ";
	}
	
	public Fruit(String name){ //constructor with 1 argument
		this.name = name;
	}
	
	public String getName() { 
		return name;
	}	
		
	public String toString() { //overriding method
		return "\n"+name+ " constructor is invoked."+ "\nEat more "+ getName() + " will be more healthy.";
	}		
	
}// end for Fruit class
