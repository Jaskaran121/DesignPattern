package ImplSingletonPattern;

import java.util.List;
import java.util.stream.Collectors;

import ISingletonPattern.ISort;

public class FactoryClass {

	//The value of this variable will never be cached thread-locally: all reads and writes will go straight to "main memory";
	private static volatile FactoryClass factory;
	
	private FactoryClass()
	{
		
	};
	
	//Solving a multi-threaded problem
	public static FactoryClass getFactory()
	{
		//if null then only apply synchronized keyword instead of always so Cost only the first time.
		if(FactoryClass.factory==null)
		{
			synchronized (FactoryClass.class)
			{
				if(FactoryClass.factory==null)
					FactoryClass.factory = new FactoryClass();
			}
		}
		return FactoryClass.factory;
	}
	
	public <E> InsertionSort<E> getInstance()
	{
		return new InsertionSort<E>();
	}
	
}


class InsertionSort<E> implements ISort<E>{

	@Override
	public List<E> sortList(List<E> aList) {
		List<E> sortedList = aList.stream().sorted().collect(Collectors.toList());
		return sortedList;
	}
	
}
