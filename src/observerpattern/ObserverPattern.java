/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author ajist
 */
public class ObserverPattern {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
	
	FruitShop theShop= new FruitShop()	;
		for (int i = 0; i < 10; i++) {
			Customer aCustomer= new Customer("customer"+i,theShop);
			theShop.addObserver(aCustomer);
			
		}
	theShop.setNotification("New fruit is about to come to the shop");
		
		theShop.notifyObservers();
		
	theShop.setNotification("New fruit is available at the shop");
		
		theShop.notifyObservers();
		
		theShop.setNotification("New fruit is about to get higher price");
		
		theShop.notifyObservers();
		
		theShop.setNotification("The price of this raw fruit one up!");
		
		theShop.notifyObservers();
		
		theShop.setNotification("The price of this raw fruit is out of stock!");
		
		theShop.notifyObservers();
		
		
		
	}
	
}
