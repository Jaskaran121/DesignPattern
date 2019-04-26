package ImplSingletonPattern;

import java.util.List;
import java.util.stream.Collectors;

import ISingletonPattern.ISort;

public class FactoryClassWithoutVolatileSynchronized {

	
	// This is a way to get a singleton using the inbuilt JVM constraints of class and object initialization. 
	//	The JVM guarantees that the static class definition LazyHolder within is not initialized until the JVM determines 
	//	that LazyHolder must be executed. The static class LazyHolder is only executed when the static method getInstance 
	//	is invoked on the class Singleton, and the first time this happens the JVM will load and initialize the LazyHolder class. 
	//	Since the class initialization phase is guaranteed by the JLS (Java Language Specification) to be serial, 
	//	i.e., non-concurrent, no further synchronization is required in the static getInstance method during loading and initialization.
	private static class LazyHolder
	{
		
		private static final FactoryClassWithoutVolatileSynchronized factory = new FactoryClassWithoutVolatileSynchronized();
	}
	
	//Solving a multi-threaded problem
	public static FactoryClassWithoutVolatileSynchronized getFactory()
	{
		return LazyHolder.factory;
	}
	
	public <E> InsertionSort<E> getInstance()
	{
		return new InsertionSort<E>();
	}
	
}

