package ClientCompositePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ICompositePattern.ISort;
import ImplCompositePattern.FactoryClass;

public class ClientClass {

	public static <E> void  main(String[] args) {
		// TODO Auto-generated method stub
		ISort<E> bubbleSort = new FactoryClass().getBubbleSortInstance();
		List<E> myList = (List<E>) new ArrayList<>(Arrays.asList(6,1,2,3,4));
		List<E> sortedList = bubbleSort.sort(myList);
		System.out.println(sortedList);
		
		ISort<E> insertionSort = new FactoryClass().getInternalSortInstance();
		List<E> sortedList1 = bubbleSort.sort(myList);
		System.out.println(sortedList);
	}

}
