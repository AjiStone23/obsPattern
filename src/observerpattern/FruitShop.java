/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ajist
 */
public class FruitShop implements IObservable {
	
    String notification;
	List<IObserver> observers;

	public FruitShop() {
		this.observers = new ArrayList<IObserver>();
	}
	
	
	
	
	@Override
	public void addObserver(IObserver o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
	this.observers.remove(o);
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	
	

	@Override
	public void notifyObservers() {
		for (IObserver observer : observers) {
			observer.update();
		}
	}
	
}
