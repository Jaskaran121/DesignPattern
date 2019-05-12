package ICompositePattern;

public interface ISortIterator<E> {
	boolean hasNext();
	ISort<E> getNext();
}
