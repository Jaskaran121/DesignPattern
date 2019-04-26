package ImplCompositePattern;

import java.util.List;
import java.util.stream.Collectors;

import ICompositePattern.ISort;

final class InsertionSort<E extends Comparable<E>> implements ISort<E> {

	@Override
	public List<E> sort(List<E> aList) {
		List<E> sortedList = aList.stream().sorted().collect(Collectors.toList());
		return sortedList;
	}

}
