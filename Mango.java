package Exercise4_4;

public class Mango extends Fruit{ //sub class of Fruit
	private String region;//r
	private String color;//c
	private double vitaminC;//v
	
	public Mango() { //constructor for sub class without argument
		super();
		this.region = " ";
		this.color = " ";
		this.vitaminC = 0.00;
	}
	
	public Mango(String name, String r,String c,double v) {//constructor for sub class with 4 arguments
		super(name);		
		this.region =r;
		this.color = c;
		this.vitaminC = v;
		
		System.out.println(name);
		
		switch(region) {
		case "Taiwan":
			System.out.print(info("Taiwan","Vivid Yellow",36.4));
			break;
		case "Hawaii":
			System.out.print(info("Hawaii","Vivid Yellow", 40.2));
			break;
		case "California ":
			System.out.print(info("California","Vivid Yellow",45.0));
			break;
		}
	}
	
	public String info() { //overloading with no argument
		return "Region\t: " + region
			   + "\nColor\t: " + color 
			   + "\nVitaminC: " + vitaminC +"\n";
	}
	
	public String info(String r, String c) { //overloading with 2 argument
		return "Region\t: " + r 
			   + "\nColor\t: " + c
			   + "\nVitaminC: " + vitaminC +"\n";
	}
	
	public String info(String r, String c,double v) { //overloading with 3 arguments
		return "Region\t: " + r 
			  + "\nColor\t: " + c 
			  + "\nVitaminC: " + v +"\n";
	}
	
	public String toString() {//overriding method
		return "\nFunction: Mangoes are a great effective at lowering blood pressure.\n" 
			 + super.toString() ;
	}

}// end for class Mango extends
