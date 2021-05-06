package Exercise4_4;

public class Blueberry extends Fruit{ //sub class of Fruit
	private int size;//s (serving size in grams)
	private int vitaminK;//vK
	
	
	public Blueberry() { //constructor for sub class with no argument
		super();
		this.size = 0;	
		this.vitaminK= 0;
	}
	
	public Blueberry(String name, int s, int vK) { //constructor for sub class with 3 argument
		super(name);
		this.size = s;	
		this.vitaminK= vK;
		
		System.out.println(name);
		
		if (this.size <= 30) {
			System.out.println("Size:" + size);
			System.out.println("We will delivery in small pack!");
			System.out.println("You can get the total Vitamin K about " + calTotalVitaminK() +" mcg."); //overloading with no arguments 
		}
		else if(this.size > 30 && this.size <= 50){
			System.out.println("Size:" + size);
			System.out.println("We will delivery in big pack!");
			System.out.println("You can get the total Vitamin K about " + calTotalVitaminK(36) +" mcg.");//overloading with 1 arguments 
		}
		else if (this.size > 50 && this.size <= 120) { //more than 50g
			//int freeVitaK = 29; (Gain the free extra small pack of VitaminK)
			System.out.println("Size:" + size);
			System.out.println("We will delivery in jar bottle!");
			System.out.println("You can get the total Vitamin K about " + calTotalVitaminK(29,42) +" mcg."); //overloading with 2 arguments 
			System.out.println("You can get free extra small pack!");
		}
		else //more than 120(need to buy more by this one of three type of serving size)
			System.out.println("We just have this three type of serving size! "
					+ "+/n We will prefer you to choose more quantity by this three type of serving size!");
	    
	}
	
	public int calTotalVitaminK() { //overloading with no argument
		return this.size * this.vitaminK;
	}
	
	public int calTotalVitaminK(int vitaK) { //overloading with 1 argument
		return this.size * vitaK;
	}
	
	public int calTotalVitaminK(int s, int vitaK) { //overloading with 2 arguments
		return s * vitaK;
	}	
	
	public String printUses() {
		return "\nThe expiry date that can uses is between 1 to 3 months.";
	}	
	
	public String toString() {//overriding method
		return printUses()
			+ super.toString() ;
	}
}// end for class Blueberry extends
