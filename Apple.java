package Exercise4_4;

public class Apple extends Fruit{ //sub class of Fruit
	protected double price;//p 
	protected int quantity;//q
	
	public Apple(String name, double p,int q) { //constructor with 3 arguments
		super(name); 
		this.price = p;	
		this.quantity = q; 	
		
	   if (this.quantity < 8) {
			totalPrice(); //overloading with no arguments 
			System.out.println(name);
			System.out.println("Price per pcs\t: RM "+ price);
			System.out.println("Quantity\t: " + quantity + " pcs");
			System.out.println("If quantity LESS than 8, Total price: RM " + totalPrice());
		}
	   
		else if (this.quantity > 8 && this.quantity < 50) {
			double pp = 15.00; //new Price
			totalPrice(pp); //overloading with 1 argument
			System.out.println(name);
			System.out.println("Price per pcs\t: RM "+ price);
			System.out.println("Quantity\t: " + quantity + " pcs");
			System.out.println("If quantity MORE than 8, Total price: RM " + totalPrice(pp));
			System.out.println("You can get FREE Shipping!!!");
		}
			
		else {
			double pp = 10.00; //if user buy more than 50, the price will be 10.00
			double d = 0.12; //discount get (12%)
			totalPrice(pp,d); //overloading with 2 arguments
			System.out.println(name);
			System.out.println("Price per pcs\t: RM "+ price);
			System.out.println("Quantity\t: " + quantity + " pcs");
			System.out.println("\nYou can get discount about" + d + " %!");
			System.out.println("If quantity MORE than 50, Total price: RM " + totalPrice(pp,d));
			System.out.println("You can get FREE Shipping and earn up to 50 Shoppee Coin and also 15% Cashback!!!");
		} 
    }
	
	public double totalPrice() { //overloading with no argument
		return this.price * this.quantity;
	}

	public double totalPrice(double pp) { //overloading with 1 argument
		return pp * this.quantity;
	}

	public double totalPrice(double pp, double d) { //overloading with 2 arguments
		return pp * this.quantity * d ;
	}


	public String toString() { //overriding method
		return super.toString()
			+ "\nThe " + name + " is 100% PURE!";
	}

} // end for class Apple extends
