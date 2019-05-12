package ImplIterator;

import java.util.List;

import ICompositePattern.ISort;
import ICompositePattern.ISortIterator;

public class ConcreteIterator<E> implements ISortIterator<E>{

	private int index;
	private List<ISort<E>> aList;
	
	public ConcreteIterator(List<ISort<E>> aList) {
		this.aList = aList;
	}
	
	@Override
	public boolean hasNext() {
		return this.index<this.aList.size()-1;
	}

	@Override
	public ISort<E> getNext() {
		ISort<E> sortAlgorithm = this.aList.get(index);
		index++;
		return sortAlgorithm;
	}

}
