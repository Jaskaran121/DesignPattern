package ImplCompositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ICompositePattern.ISort;
import ICompositePattern.ITypeofSort;

public class TypeofSort<E> implements ITypeofSort<E> {

	private List<ISort<E>> listOfSortAlgorithms;
	private String name;
	
	TypeofSort(String name)
	{
		this.name = name;
		listOfSortAlgorithms = new ArrayList<ISort<E>>();
	}
	@Override
	public List<E> sort(List<E> aList) {
		Iterator<E> iterator = (Iterator<E>) this.listOfSortAlgorithms.iterator();
		List<E> sortedList = null;
		while(iterator.hasNext())
		{
			sortedList = ((ISort<E>) iterator.next()).sort(aList);
		}
		return sortedList;
	}

	@Override
	public List<ISort<E>> getSortAlgorithms() {
		return this.listOfSortAlgorithms;
	}

	@Override
	public String getTypeName() {
		return this.name;
	}

}
