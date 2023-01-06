package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.CartScreen;
//import hust.soict.dsai.aims.media.*;
public class CartTest {
	public static void main(String[] args) throws LimitExceededException {
		// Create a new Cart
		Cart cart = new Cart();
		// Create new dvd Object and add them to the Cart	
			// Create new dvd1		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
			
			// Create new dvd2
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		
			// Create new dvd3
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addMedia(dvd3);
		
		// Test the method print Cart
//		cart.printCart();
		// To-do: Test the search methods here	
		CartScreen cs = new CartScreen(cart);
	}


//public class CartTest {
//    public static void main(String[] args) {
//        // Create a new cart
//        Cart cart = new Cart();
//
//        // Create new dvd objects and add them to the cart
//        Media dvd1 = new DigitalVideoDisc("The Lion King", 
//        		"Animation", "Roger Allers", 87, 19.95f);
//        cart.addMedia(dvd1);
//
//        Media dvd2 = new DigitalVideoDisc("Star Wars", 
//        		"Science Fiction", "Geogre Lucas", 87, 24.95f);
//        cart.addMedia(dvd2);
//
//        Media dvd3 = new DigitalVideoDisc("Aladin", 
//        		"Animation", 18.99f);
//        cart.addMedia(dvd3);

//        // Test the print method
//        cart.print();
//        // To-do: Test the search method here
//        cart.searchByID(1);
//        cart.searchByID(4);
//
//        cart.searchByTitle("Aladin");
//        cart.searchByTitle("Lion");
}
