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
public class Customer implements IObserver {
    String customerName;
	FruitShop shop;

	public Customer(String customerName, FruitShop shop) {
		this.customerName = customerName;
		this.shop = shop;
	}

	
	@Override
	public void update() {
		
		String notification=this.shop.getNotification();
		System.out.println("Iam "+ customerName+ " and I got notified that:"+notification);
		
		
	}
	
}
