package ICompositePattern;

import java.util.List;

public interface ITypeofSort<E> extends ISort<E>{
public List<E> sort(List<E> aList);
public List<ISort<E>> getSortAlgorithms();
String getTypeName();
}
