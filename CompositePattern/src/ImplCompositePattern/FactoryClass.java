package ImplCompositePattern;

import java.util.List;

import ICompositePattern.ISort;
import ICompositePattern.ITypeofSort;

public class FactoryClass {

	public <E> ISort<E> getInternalSortInstance()
	{
		ITypeofSort<E> internalSort = new TypeofSort<E>("internalSort");
		
		ISort<E> bubbleSort = this.getBubbleSortInstance();
		ISort<E> insertionSort = this.getInsertionSort();
		internalSort.getSortAlgorithms().add(bubbleSort);
		internalSort.getSortAlgorithms().add(insertionSort);
		return internalSort;
	}
	
	public <E> ISort<E> getBubbleSortInstance()
	{
		return new BubbleSort();
	}
	
	public <E> ISort<E> getInsertionSort()
	{
		return new InsertionSort();
	}
}
