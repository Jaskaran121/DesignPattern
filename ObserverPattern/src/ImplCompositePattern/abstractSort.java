package ImplCompositePattern;
//import java.util.Comparator;
import java.util.List;

//Subject
public abstract class abstractSort<E extends Comparable<E>> {

	public void swapValues(List<E> aList,int j)
	{
		E temp;
		temp = aList.get(j);
		 aList.set(j, aList.get(j+1));
		 aList.set(j+1, temp);
	}

	public boolean compareValues(List<E> aList,int j)
	{
		return aList.get(j).compareTo(aList.get(j+1)) > 0;
	}
}
