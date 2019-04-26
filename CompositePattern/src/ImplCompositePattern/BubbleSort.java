package ImplCompositePattern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ICompositePattern.ISort;

final class BubbleSort<E extends Comparable<E>> implements ISort<E> {

	
//Not actually implementing bubble sort
@Override
public List<E> sort(List<E> aList) {
	List<E> sortedList = aList.stream().sorted().collect(Collectors.toList());
	return sortedList;
}
}
