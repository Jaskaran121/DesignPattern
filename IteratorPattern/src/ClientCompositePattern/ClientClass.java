package ClientCompositePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ICompositePattern.ISort;
import ICompositePattern.ISortIterator;
import ImplCompositePattern.FactoryClass;

public class ClientClass {

	public static <E> void  main(String[] args) {
		// TODO Auto-generated method stub
		ISort<E> bubbleSort = FactoryClass.getUniqueInstance().getBubbleSortInstance();
		List<E> myList = (List<E>) new ArrayList<>(Arrays.asList(6,1,2,3,4));
		List<E> sortedList = bubbleSort.sort(myList);
		System.out.println(sortedList);
		
		ISortIterator<E> iterator = FactoryClass.getUniqueInstance().getInternalSortInstance();
		List<E> myList1 = (List<E>) new ArrayList<>(Arrays.asList(6,8,2,3,4));
		while(iterator.hasNext())
		{
			List<E> sortedListNew = iterator.getNext().sort(myList1);
			System.out.println(sortedListNew);
			}
		
	}

}
