package clientSingletonPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ISingletonPattern.ISort;
import ImplSingletonPattern.FactoryClass;
import ImplSingletonPattern.FactoryClassWithoutVolatileSynchronized;

public class clientClass {

	public static <E> void main (String[] args) {
		
		FactoryClass factory = FactoryClass.getFactory();
		ISort<E> insertionSort = factory.getInstance();
		
		//Sorting a Integer List
		List<E> aList = (List<E>) new ArrayList<>(Arrays.asList(4,1,3,2));
		List<E> sortedList  = insertionSort.sortList(aList);
		System.out.println(sortedList);
		
		//Sorting a String List
		
		List<E> aList1 = (List<E>) new ArrayList<>(Arrays.asList("Jas","Singh","Kukreja"));
		sortedList  = insertionSort.sortList(aList1);
		System.out.println(sortedList);
		
		//Calling factory instance without using volatile or synchronized keyword
		FactoryClassWithoutVolatileSynchronized factoryWithout = FactoryClassWithoutVolatileSynchronized.getFactory();
		ISort<E> insertionSortWithout = factory.getInstance();
		List<E> aList2 = (List<E>) new ArrayList<>(Arrays.asList(4,1,3,2));
		sortedList  = insertionSortWithout.sortList(aList2);
		System.out.println(sortedList);
	}

}
