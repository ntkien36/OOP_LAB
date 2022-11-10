package Code;
import Code.Cart;
import Code.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		//Create a new cart
		Cart anOrder = new Cart();
		
		//Create new dvd objects and add them to the card
		DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", 
				"Science Fiction", "Geogre Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", 
				"Animation","", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		//print total cost of the items in the cart
		System.out.printf("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
		//print total cost of the items in the cart after removing dvd3
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.printf("Total cost after removing dvd3 is: ");
		System.out.println(anOrder.totalCost());
	}
}
