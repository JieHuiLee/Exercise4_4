package Exercise4_4; //Update Exercise 4.3

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Fruit Shop");
		System.out.print("--------------------------\n");
		//Fruit f = new Fruit(); //no need new object for super class
		
		Apple a = new Apple ("Apple",18.00,5); //new object for sub class
		System.out.println(a+ "\n==================");
		System.out.println();
		
		GreenApple g= new GreenApple("Green Apple",30.09,4,"sour", 4.0);
		System.out.println(g+"\n==================");
		System.out.println();
		
		RedApple r = new RedApple("Red Apple",11.90,7,182.00,52);
		System.out.println(r+"\n==================");
		System.out.println();
		
		Mango m = new Mango ("Mango","Taiwan","Vivid yellow",36.4);
		System.out.println(m+"\n==================");
		System.out.println();
		
		Blueberry b = new Blueberry("Blueberry", 40, 29);
		System.out.println(b);
		System.out.println("\n=======Thank You======");
	}
	
}//end main class
