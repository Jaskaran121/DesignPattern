package ImplCompositePattern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ICompositePattern.ISort;

final class BubbleSort<E extends Comparable<E>> extends abstractSort<E> implements ISort<E> {
	
@Override
public List<E> sort(final List<E> aList) {
	 final int listSize = aList.size();
	 //final E[] array = (E[]) aList.toArray();
	 
	 for (int i = 0; i < listSize - 1; i++) {
		 for (int j = 0; j < listSize - 1; j++) {
			 if (compareValues(aList, j)) {
				 swapValues(aList, j);
			 }
		 }
	 	}
	 return (aList);
	 }

}
