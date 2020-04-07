/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.List;

/**
 *
 * @author ajist
 */
public interface IObservable {
	
	public void notifyObservers();
	public void addObserver (IObserver o);
	public void removeObserver (IObserver o);
	
}
