/**
 * 
 */
package edu.uvg.model;

import edu.uvg.controller.IComparator;

/**
 * @author moise
 *
 */
public class CompareByYearDesc<T> implements IComparator<T>{

	@Override
	public int Compare(T _object1, T _object2) {
		Automovil auto1 = (Automovil)_object1;
		Automovil auto2 = (Automovil)_object2;
		
		if (auto1.getAnio_Fabricacion() > auto2.getAnio_Fabricacion())
			return -1;
		else if (auto1.getAnio_Fabricacion() < auto2.getAnio_Fabricacion())
			return 1;
		else
			return 0;
	}

}
