/**
 * 
 */
package edu.uvg.model;

import edu.uvg.controller.IComparator;

/**
 * @author moise
 *
 */
public class CompareByBrandLineAsc<T> implements IComparator<T> {

	@Override
	public int Compare(T _object1, T _object2) {
		Automovil auto1 = (Automovil)_object1;
		Automovil auto2 = (Automovil)_object2;
		
		if (auto1.getMarca().compareTo(auto2.getMarca()) > 0)
			return 1;
		else if (auto1.getMarca().compareTo(auto2.getMarca()) < 0)
			return -1;
		else {
			if (auto1.getLinea().compareTo(auto2.getLinea()) > 0)
				return 1;
			else if (auto1.getLinea().compareTo(auto2.getLinea()) < 0)
				return -1;
			else 
				return 0;
		}
			
	}

}
