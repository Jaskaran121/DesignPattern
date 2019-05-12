package ImplCompositePattern;

import java.util.List;

import ICompositePattern.ISort;
import ICompositePattern.ISortIterator;
import ICompositePattern.ITypeofSort;
import ImplIterator.ConcreteIterator;

public class FactoryClass {
	private static class FactoryClassInstanceHolder{
	private static FactoryClass UniqueFactory= new FactoryClass();
}

	public static FactoryClass getUniqueInstance()
	{
	return FactoryClassInstanceHolder.UniqueFactory;
	}
	
	private FactoryClass()
	{
		
	}
	public <E> ISortIterator<E> getInternalSortInstance()
	{
		ITypeofSort<E> internalSort = new TypeofSort<E>("internalSort");
		
		ISort<E> bubbleSort = this.getBubbleSortInstance();
		ISort<E> insertionSort = this.getInsertionSort();
		internalSort.getSortAlgorithms().add(bubbleSort);
		internalSort.getSortAlgorithms().add(insertionSort);
		return new ConcreteIterator(internalSort.getSortAlgorithms());
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
