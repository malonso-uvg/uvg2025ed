package edu.uvg;

import java.util.Scanner;

import edu.uvg.controller.Sort;
import edu.uvg.model.Automovil;
import edu.uvg.model.CompareByBrandLineAsc;
import edu.uvg.model.CompareByYearAsc;
import edu.uvg.model.CompareByYearDesc;
import edu.uvg.model.CompareIntegers;

/**
 * Hello world!
 *
 */
public class App 
{
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil[] arregloAutos = new Automovil[5];
		arregloAutos[0] = new Automovil("Toyota", "Yaris", 2017, 200);
		arregloAutos[1] = new Automovil("Honda", "Civic", 2007, 10);
		arregloAutos[2] = new Automovil("Toyota", "Corolla", 2015, 5);
		arregloAutos[3] = new Automovil("Honda", "CRV", 2016, 2);
		arregloAutos[4] = new Automovil("Nissan", "Sentra", 1992, 8);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Presione Enter para continuar");
		in.nextLine();
		
		
		Sort<Automovil> mySort = new Sort<Automovil>(new CompareByYearDesc<Automovil>());
		
		System.out.println(" ** Arreglo original **");
		for (int i = 0; i < arregloAutos.length; i++) {
			System.out.println("Auto: " + arregloAutos[i].getMarca() + " " + arregloAutos[i].getLinea() + " " + arregloAutos[i].getAnio_Fabricacion());
		}
		
		mySort.BubbleSort(arregloAutos);
		
		System.out.println(" ** Arreglo ordenado descendente por año **");
		for (int i = 0; i < arregloAutos.length; i++) {
			System.out.println("Auto: " + arregloAutos[i].getMarca() + " " + arregloAutos[i].getLinea() + " " + arregloAutos[i].getAnio_Fabricacion());
		}
		
		mySort.myCompare = new CompareByYearAsc<Automovil>();
		mySort.insertionSort(arregloAutos);
		
		System.out.println(" ** Arreglo ordenado ascendente por año**");
		for (int i = 0; i < arregloAutos.length; i++) {
			System.out.println("Auto: " + arregloAutos[i].getMarca() + " " + arregloAutos[i].getLinea() + " " + arregloAutos[i].getAnio_Fabricacion());
		}
		
		mySort.myCompare = new CompareByBrandLineAsc<Automovil>();
		mySort.quickSort(arregloAutos, 0, arregloAutos.length - 1);
		
		System.out.println(" ** Arreglo ordenado ascendente por marca**");
		for (int i = 0; i < arregloAutos.length; i++) {
			System.out.println("Auto: " + arregloAutos[i].getMarca() + " " + arregloAutos[i].getLinea() + " " + arregloAutos[i].getAnio_Fabricacion());
		}
		
		Sort<Integer> myNumberSortAlgorithm = new Sort<Integer>(new CompareIntegers<Integer>());
		Integer[] arregloEnteros = new Integer[10000];
		for (int i = 0; i < 10000; i++) {
			arregloEnteros[i] = (int)(Math.random() * 10001);
		}

		//myNumberSortAlgorithm.BubbleSort(arregloEnteros);
		myNumberSortAlgorithm.insertionSort(arregloEnteros);
		
	}
}
